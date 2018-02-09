package com.pccw.immd.adminfunc.service.impl;

import com.pccw.immd.adminfunc.service.UmpsEndPointServiceWithHeader;
import com.pccw.immd.adminfunc.utils.PasswordUtil;
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

import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

@Service("umpsEndPointServiceWithHeader")
public class UmpsEndPointServiceWithHeaderImpl implements UmpsEndPointServiceWithHeader {

    private final static Logger LOOGER = LoggerFactory.getLogger(UmpsEndPointServiceWithHeaderImpl.class);

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
        String hashedPassword = PasswordUtil.performHash(password);

        // TODO: Waiting Jason Tam  confirm the System ID for AdminFunc
        // Temporary set to "UP"
        systemId = "UP";
        addSoapHeader(userId, systemId, terminalId);
        Iss3UserSignOnDTO authenticatedUser = upmsClientProxy.userAuthenticate(userId, hashedPassword, terminalId);
        return authenticatedUser;
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
