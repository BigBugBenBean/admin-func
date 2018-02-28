package com.pccw.immd.adminfunc.service.impl;

import com.pccw.immd.adminfunc.service.UpmsEndPointService;
import com.pccw.immd.adminfunc.utils.PasswordUtil;
import org.springframework.stereotype.Service;
import ws.upms.immd.v1.ITIAppException;
import ws.upms.immd.v1.ITISysException;

@Service("umpsEndPointService")
public class UpmsEndPointServiceImpl extends AbstractUpmsBaseService implements UpmsEndPointService {

    @Override
    public void changePassword(String userId, String password, String newPassword) throws ITIAppException, ITISysException {
        String hashedPassword = PasswordUtil.performHash(password);
        String hashedNewPassword = PasswordUtil.performHash(newPassword);

        getUpmsClientProxy().changePassword(userId, hashedPassword, hashedNewPassword);
    }

    @Override
    public void logout(String userId) throws ITIAppException, ITISysException {
        getUpmsClientProxy().forceLogout(userId);
    }


}
