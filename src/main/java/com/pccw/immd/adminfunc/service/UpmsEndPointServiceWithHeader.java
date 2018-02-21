package com.pccw.immd.adminfunc.service;

import ws.upms.immd.v1.ITIAppException;
import ws.upms.immd.v1.ITISysException;
import ws.upms.immd.v1.Iss3UserSignOnDTO;

public interface UpmsEndPointServiceWithHeader {

    public Iss3UserSignOnDTO userAuthenticate(String userId, String password, String terminalId) throws ITIAppException, ITISysException;
}
