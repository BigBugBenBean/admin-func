package com.pccw.immd.adminfunc.service.impl;

import com.pccw.immd.adminfunc.dto.UpmsUser;
import com.pccw.immd.adminfunc.service.UmpsEndPointService;
import com.pccw.immd.adminfunc.service.UmpsEndPointServiceWithHeader;
import com.pccw.immd.adminfunc.service.UpmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ws.upms.immd.v1.ITIAppException;
import ws.upms.immd.v1.ITISysException;
import ws.upms.immd.v1.Iss3UserSignOnDTO;

@Service("upmsService")
public class UpmsServiceImpl implements UpmsService {

    @Autowired
    @Qualifier ("umpsEndPointService")
    private UmpsEndPointService umpsEndPointService;

    @Autowired
    @Qualifier ("umpsEndPointServiceWithHeader")
    private UmpsEndPointServiceWithHeader umpsServiceWithHeader;


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


    public UpmsUser login(String userId, String password, String terminalId) throws ITIAppException, ITISysException {
        Iss3UserSignOnDTO userAuthenticateResponse = umpsServiceWithHeader.userAuthenticate(userId, password, terminalId);
        UpmsUser user = new UpmsUser(userAuthenticateResponse);
        return user;
    }

    public void changePassword(String userId, String password, String newPassword)throws ITIAppException, ITISysException {
        umpsEndPointService.changePassword(userId, password, newPassword);
    }
}
