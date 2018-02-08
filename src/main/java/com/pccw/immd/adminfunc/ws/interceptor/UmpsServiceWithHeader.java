package com.pccw.immd.adminfunc.ws.interceptor;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.headers.Header;
import org.apache.cxf.jaxb.JAXBDataBinding;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import ws.upms.immd.v1.AppUserInfoHeader;
import ws.upms.immd.v1.ITIAppException;
import ws.upms.immd.v1.ITISysException;
import ws.upms.immd.v1.Iss3UserSignOnDTO;
import ws.upms.immd.v1.LDAPImmdUserServiceExtWS;

@Service("umpsServiceWithHeader")
public class UmpsServiceWithHeader {

    private final static Logger LOOGER = LoggerFactory.getLogger(UmpsServiceWithHeader.class);

    private static final String NAMESPACE_URI = "http://immd.itifwk.ws/v1";

	private static final String APP_USER_INFO_HEADER = "AppUserInfo";

    @Value("${web.umps.endpoint}")
    private String upmsEndpoint;
    
    private Client proxy;

    private LDAPImmdUserServiceExtWS upmsClientProxy;

    public Iss3UserSignOnDTO userAuthenticate(String userId, String password, String terminalId) throws ITIAppException, ITISysException {
        if (upmsClientProxy == null) {
            upmsClientProxy = (LDAPImmdUserServiceExtWS)upmsProxyFactoryBean().create();
            proxy = ClientProxy.getClient(upmsClientProxy);
        }
        String systemId = "";
        String hashedPassword = performHash(password);

        // TODO: Waiting Jason Tam  confirm the System ID for AdminFunc
        // Temporary set to "UP"
        systemId = "UP";
        addSoapHeader(userId, systemId, terminalId);
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

    private void addSoapHeader(String userId, String systemId, String terminalId) {
        List<Header> headers = new ArrayList<Header>();
        AppUserInfoHeader appHeader = new AppUserInfoHeader();
        
        appHeader.setSystemID(systemId);
        
        /*
         * Terminal ID must NULL
         */
        appHeader.setTerminalID(terminalId);
        appHeader.setUserID(userId);
//        appHeader.setHostName("XXXXXXXXX");
//        appHeader.setLocationID(ropuser.getLocationCode());
        Header appUserInfoHeader = null;
        try {
            appUserInfoHeader = new Header(new QName(NAMESPACE_URI, APP_USER_INFO_HEADER),
                    appHeader,
                    new JAXBDataBinding(AppUserInfoHeader.class));
        } catch (JAXBException e) {
            LOOGER.debug("Form Header Exception ... ");
        }

        headers.add(appUserInfoHeader);
        proxy.getRequestContext().put(Header.HEADER_LIST, headers);
    }

    private JaxWsProxyFactoryBean upmsProxyFactoryBean() {
        JaxWsProxyFactoryBean proxyFactory = new JaxWsProxyFactoryBean();
        proxyFactory.setServiceClass(LDAPImmdUserServiceExtWS.class);
        proxyFactory.setAddress(upmsEndpoint);
        return proxyFactory;
    }
}
