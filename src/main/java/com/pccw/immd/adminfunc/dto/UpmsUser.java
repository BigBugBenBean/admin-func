package com.pccw.immd.adminfunc.dto;

import ws.upms.immd.v1.Iss3UserSignOnDTO;
import ws.upms.immd.v1.UserAuthenticateResponse;

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
