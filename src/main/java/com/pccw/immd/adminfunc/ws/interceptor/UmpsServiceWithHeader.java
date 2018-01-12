package com.pccw.immd.adminfunc.ws.interceptor;

import org.apache.cxf.headers.Header;

import org.apache.cxf.frontend.ClientProxy;

import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxb.JAXBDataBinding;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;
import ws.upms.immd.v1.*;

@Service("umpsServiceWithHeader")
public class UmpsServiceWithHeader {



    private final static Logger LOOGER = LoggerFactory.getLogger(UmpsServiceWithHeader.class);

    private static final String NAMESPACE_URI = "http://immd.itifwk.ws/v1";

//    private String upmsEndpoint = "https://upvdc1lvwb01h02.iss3dev.immd.hksarg:8443/war.upms.ws/services/buzz/ldapImmdUserServiceExtWS";
    @Value("${web.umps.endpoint}")
    private String upmsEndpoint;

    @Autowired
    private ApplicationContext context;

    Client proxy;

    public UmpsServiceWithHeader() {
//        proxy = ClientProxy.getClient(upmsClientProxy);
    }

    private LDAPImmdUserServiceExtWS upmsClientProxy;
    //= context.getBean( ws.upms.immd.v1.LDAPImmdUserServiceExtWS.class);


    public Iss3UserSignOnDTO userAuthenticate(String userId, String password, String terminalId) throws ITIAppException, ITISysException {
        if (upmsClientProxy == null) {
            upmsClientProxy = (LDAPImmdUserServiceExtWS)upmsProxyFactoryBean().create();
            proxy = ClientProxy.getClient(upmsClientProxy);
        }
        String systemId = "";
        String hashedPassword = performHash(password);
        addSoapHeader(userId, systemId);
        String decoratedHashedPassword = decoratePassword(hashedPassword);
        Iss3UserSignOnDTO authenticatedUser = upmsClientProxy.userAuthenticate(userId, decoratedHashedPassword, terminalId);
        return authenticatedUser;
    }

    private String decoratePassword(String hashedPassword) {
        return "{sha256}" + hashedPassword;
    }

    private String performHash(String password) {
        byte[] data = password.getBytes();
        try {
            MessageDigest digester = MessageDigest.getInstance("SHA-256");
            digester.update(data);
            return Base64.getEncoder().encodeToString(digester.digest());
        } catch (NoSuchAlgorithmException ex){
            LOOGER.debug("PerformHash Password Exception ... ");
        }
        return password;
    }

    private void addSoapHeader(String userId, String systemId) {
        List<Header> headers = new ArrayList<Header>();
        AppUserInfoHeader appHeader = new AppUserInfoHeader();
        appHeader.setSystemID("UP");
        appHeader.setTerminalID(systemId);
        appHeader.setUserID(userId);
//        appHeader.setHostName("XXXXXXXXX");
//        appHeader.setLocationID(ropuser.getLocationCode());
        Header appUserInfoHeader = null;
        try {
            appUserInfoHeader = new Header(new QName(NAMESPACE_URI, "AppUserInfo"),
                    appHeader,
                    new JAXBDataBinding(AppUserInfoHeader.class));
        } catch (JAXBException e) {
            LOOGER.debug("Form Header Exception ... ");
        }

        headers.add(appUserInfoHeader);
        proxy.getRequestContext().put(Header.HEADER_LIST, headers);
    }

//    @Bean
    public JaxWsProxyFactoryBean upmsProxyFactoryBean() {
        JaxWsProxyFactoryBean proxyFactory = new JaxWsProxyFactoryBean();
        proxyFactory.setServiceClass(LDAPImmdUserServiceExtWS.class);
        proxyFactory.setAddress(upmsEndpoint);
        return proxyFactory;
    }
}
