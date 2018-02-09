package com.pccw.immd.adminfunc.service;

import ws.upms.immd.v1.ITIAppException;
import ws.upms.immd.v1.ITISysException;
import ws.upms.immd.v1.Iss3UserSignOnDTO;

public interface UmpsEndPointService {

    public void changePassword(String userId, String password, String newPassword) throws ITIAppException, ITISysException;
}
