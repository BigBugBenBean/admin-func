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
public class UmpsEndPointServiceImpl extends AbstractUmpsBaseService implements UmpsEndPointService {

    @Override
    public void changePassword(String userId, String password, String newPassword) throws ITIAppException, ITISysException {
        String hashedPassword = PasswordUtil.performHash(password);
        String hashedNewPassword = PasswordUtil.performHash(newPassword);

        getUpmsClientProxy().changePassword(userId, hashedPassword, hashedNewPassword);
    }
}
