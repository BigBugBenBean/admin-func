package com.pccw.immd.adminfunc.ws.interceptor;

import org.apache.cxf.headers.Header;

import org.apache.cxf.frontend.ClientProxy;

import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxb.JAXBDataBinding;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;
import ws.upms.immd.v1.*;

@Service("umpsServiceWithHeader")
public class UmpsServiceWithHeader {

//    private final static Logger authLogger = LoggerFactory.getLogger(UmpsServiceWithHeader.class);

    private static final String NAMESPACE_URI = "http://immd.itifwk.ws/v1";

    private String upmsEndpoint = "https://upvdc1lvwb01h02.iss3dev.immd.hksarg:8443/war.upms.ws/services/buzz/ldapImmdUserServiceExtWS";

    @Autowired
    private ApplicationContext context;

    Client proxy;

    public UmpsServiceWithHeader() {
//        proxy = ClientProxy.getClient(upmsClientProxy);
    }

    private LDAPImmdUserServiceExtWS upmsClientProxy;
    //= context.getBean( ws.upms.immd.v1.LDAPImmdUserServiceExtWS.class);


    public Iss3UserSignOnDTO userAuthenticate(String userId, String hashedPassword, String terminalId) throws ITIAppException, ITISysException {
        if (upmsClientProxy == null) {
            upmsClientProxy = (LDAPImmdUserServiceExtWS)upmsProxyFactoryBean().create();
            proxy = ClientProxy.getClient(upmsClientProxy);
        }
        String systemId = "";
        addSoapHeader(userId, systemId);
//        String decoratedHashedPassword = decoratePassword(hashedPassword);
        Iss3UserSignOnDTO authenticatedUser = upmsClientProxy.userAuthenticate(userId, hashedPassword, terminalId);
        return authenticatedUser;
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
            e.printStackTrace();
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
