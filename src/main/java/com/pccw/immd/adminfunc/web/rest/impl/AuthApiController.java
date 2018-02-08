package com.pccw.immd.adminfunc.web.rest.impl;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.pccw.immd.adminfunc.dto.UpmsUser;
import com.pccw.immd.adminfunc.dto.UserDTO;
import com.pccw.immd.adminfunc.service.UpmsService;
import com.pccw.immd.adminfunc.web.rest.AuthApi;
import com.pccw.immd.adminfunc.ws.upms.cxf.ITIAppException;
import com.pccw.immd.adminfunc.ws.upms.cxf.ITISysException;

import io.swagger.annotations.ApiParam;

@Controller
public class AuthApiController implements AuthApi {

    private static final Logger LOG = LoggerFactory.getLogger(AuthApiController.class);

    @Autowired
    @Qualifier ("upmsService")
    private UpmsService upmsService;

//    @RequestMapping(value = "/login.html", method = RequestMethod.GET)
    public String loginPage() {
        return "index";
    }

    public UpmsUser login(@ApiParam(value = "" ,required=true )  @RequestBody  @Valid UserDTO userDTO) throws ITIAppException, ITISysException {
//        String userId = "A5";
//        String password = "{sha256}+svXlT+p7mThxXc46ulsXzLEFbNwER3is8+mtZsjrQA=";
//        userId = "SCUSER08";
//        password =        "{sha256}XohImNooBHFR0OVvjcYpJ3NgPQ1qq73WKhHvch0VQtg=";
        String termialId = "";

        LOG.info("Calling login ... ");
        UpmsUser user = upmsService.login(userDTO.getLoginId(), userDTO.getPassword(), termialId);
        return user;
    }

}
