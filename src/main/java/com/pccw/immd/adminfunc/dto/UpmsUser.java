package com.pccw.immd.adminfunc.dto;

import com.pccw.immd.adminfunc.ws.upms.cxf.Iss3UserSignOnDTO;
import com.pccw.immd.adminfunc.ws.upms.cxf.UserAuthenticateResponse;

public class UpmsUser {

    private String name;

    private int age;

    private UserAuthenticateResponse userAuthenticateResponse;

    private Iss3UserSignOnDTO iss3UserSignOnDTO;

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }



    public UpmsUser(Iss3UserSignOnDTO iss3UserSignOnDTO ) {
        this.iss3UserSignOnDTO = iss3UserSignOnDTO;
    }

    public UpmsUser(UserAuthenticateResponse userAuthenticateResponse ) {
        this.userAuthenticateResponse = userAuthenticateResponse;
    }

    public UserAuthenticateResponse getUserAuthenticateResponse() {
        return userAuthenticateResponse;
    }

    public Iss3UserSignOnDTO getIss3UserSignOnDTO() {
        return iss3UserSignOnDTO;
    }
}
