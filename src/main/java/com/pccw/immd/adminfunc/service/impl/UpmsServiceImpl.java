package com.pccw.immd.adminfunc.service.impl;

import com.pccw.immd.adminfunc.dto.UpmsUser;
import com.pccw.immd.adminfunc.service.UpmsService;
import com.pccw.immd.adminfunc.ws.interceptor.UmpsServiceWithHeader;
import com.pccw.immd.adminfunc.ws.upms.cxf.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("upmsService")
public class UpmsServiceImpl implements UpmsService {

    @Autowired
    private UmpsServiceWithHeader umpsServiceWithHeader;


//    public UpmsUser login(String userId, String password, String terminalId) throws ITIAppException, ITISysException {
//        ObjectFactory factory = new ObjectFactory();
//        AppUserInfoHeader appUser = new AppUserInfoHeader();
//        appUser.setUserID(userId);
//        appUser.setSystemID("UP");
//        UserAuthenticate userAuthenticate = new UserAuthenticate();
//        userAuthenticate.setUserID(userId);
//        userAuthenticate.setHashedPassword(password);
//
//        LDAPImmdUserServiceExtWS service = ( new LDAPImmdUserServiceExtWS_Service()).getLDAPImmdUserServiceExtWSImplPort();
////        UserAuthenticateResponse userAuthenticateResponse = service.userAuthenticate(userAuthenticate, appUser);
////        return userAuthenticateResponse;
//        Iss3UserSignOnDTO userAuthenticateResponse = service.userAuthenticate(userId, password, terminalId);
//        UpmsUser user = new UpmsUser(userAuthenticateResponse);
//        return user;
//    }


    public UpmsUser login(String userId, String password, String terminalId) throws ITIAppException, ITISysException  {
        Iss3UserSignOnDTO userAuthenticateResponse = umpsServiceWithHeader.userAuthenticate(userId, password, terminalId);
        UpmsUser user = new UpmsUser(userAuthenticateResponse);
        return user;
    }
}
