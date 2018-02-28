package com.pccw.immd.adminfunc.service.impl;

import com.pccw.immd.adminfunc.dto.UpmsUser;
import com.pccw.immd.adminfunc.service.UpmsEndPointService;
import com.pccw.immd.adminfunc.service.UpmsEndPointServiceWithHeader;
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
    private UpmsEndPointService umpsEndPointService;

    @Autowired
    @Qualifier ("umpsEndPointServiceWithHeader")
    private UpmsEndPointServiceWithHeader umpsServiceWithHeader;

    public UpmsUser login(String userId, String password, String terminalId) throws ITIAppException, ITISysException {
        Iss3UserSignOnDTO userAuthenticateResponse = umpsServiceWithHeader.userAuthenticate(userId, password, terminalId);
        UpmsUser user = new UpmsUser(userAuthenticateResponse);
        return user;
    }

    @Override
    public void changePassword(String userId, String password, String newPassword) throws ITIAppException, ITISysException {
            umpsEndPointService.changePassword(userId, password, newPassword);
    }

    @Override
    public void logout(String userId)throws ITIAppException, ITISysException {
        umpsEndPointService.logout(userId);
    }
}
