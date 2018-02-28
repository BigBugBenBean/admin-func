package com.pccw.immd.adminfunc.service;

import ws.upms.immd.v1.ITIAppException;
import ws.upms.immd.v1.ITISysException;

public interface UpmsEndPointService {

    void changePassword(String userId, String password, String newPassword) throws ITIAppException, ITISysException;

    void logout(String userId) throws ITIAppException, ITISysException;
}
