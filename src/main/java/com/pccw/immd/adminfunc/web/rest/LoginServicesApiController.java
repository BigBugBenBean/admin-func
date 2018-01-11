package com.pccw.immd.adminfunc.web.rest;

import com.pccw.immd.adminfunc.dto.UpmsUser;
import com.pccw.immd.adminfunc.service.UpmsService;
import com.pccw.immd.adminfunc.web.rest.intr.LoginServicesApi;
import com.pccw.immd.adminfunc.dto.UserDTO;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ws.upms.immd.v1.ITIAppException;
import ws.upms.immd.v1.ITISysException;

import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-01T03:56:21.323Z")

@RestController
public class LoginServicesApiController implements LoginServicesApi {

    private static final Logger LOG = LoggerFactory.getLogger(LoginServicesApiController.class);

    @Autowired
    @Qualifier ("upmsService")
    private UpmsService upmsService;

    public UpmsUser login(@ApiParam(value = "" ,required=true )  @RequestBody  @Valid UserDTO userDTO) throws ITIAppException, ITISysException {
//        String userId = "A5";
//        String password = "{sha256}+svXlT+p7mThxXc46ulsXzLEFbNwER3is8+mtZsjrQA=";
//        userId = "SCUSER08";
//        password =        "{sha256}XohImNooBHFR0OVvjcYpJ3NgPQ1qq73WKhHvch0VQtg=";
        String termialId = "";

        // do some magic!
        LOG.info("Calling login ... ");
        UpmsUser user =
//                upmsService.login(userId, password, termialId);
                upmsService.login(userDTO.getLoginId(), userDTO.getPassword(), termialId);
//        user.setName("Test Ricky");
//        user.setAge(18);

        return user;
    }

}
