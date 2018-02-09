package com.pccw.immd.adminfunc.service.impl;

import com.pccw.immd.adminfunc.service.UmpsEndPointService;
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
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@Service("umpsEndPointService")
public class UmpsEndPointServiceImpl implements UmpsEndPointService {

    private final static Logger LOOGER = LoggerFactory.getLogger(UmpsEndPointServiceImpl.class);

    private static final String NAMESPACE_URI = "http://immd.itifwk.ws/v1";

	private static final String APP_USER_INFO_HEADER = "AppUserInfo";

    @Value("${web.umps.endpoint}")
    private String upmsEndpoint;
    
    private Client proxy;

    private LDAPImmdUserServiceExtWS upmsClientProxy;

    @Override
    public void changePassword(String userId, String password, String newPassword) throws ITIAppException, ITISysException {
        if (upmsClientProxy == null) {
            upmsClientProxy = (LDAPImmdUserServiceExtWS)upmsProxyFactoryBean().create();
            proxy = ClientProxy.getClient(upmsClientProxy);
        }
        String hashedPassword = PasswordUtil.performHash(password);
        String hashedNewPassword = PasswordUtil.performHash(newPassword);

        upmsClientProxy.changePassword(userId, hashedPassword, hashedNewPassword);
    }

    private JaxWsProxyFactoryBean upmsProxyFactoryBean() {
        JaxWsProxyFactoryBean proxyFactory = new JaxWsProxyFactoryBean();
        proxyFactory.setServiceClass(LDAPImmdUserServiceExtWS.class);
        proxyFactory.setAddress(upmsEndpoint);
        return proxyFactory;
    }
}
