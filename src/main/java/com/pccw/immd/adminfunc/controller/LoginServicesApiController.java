package com.pccw.immd.adminfunc.controller;

import com.pccw.immd.adminfunc.controller.intr.LoginServicesApi;
import com.pccw.immd.adminfunc.dto.UserDTO;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-01T03:56:21.323Z")

@Controller
public class LoginServicesApiController implements LoginServicesApi {

    private static final Logger LOG = LoggerFactory.getLogger(LoginServicesApiController.class);

    public ResponseEntity<String> login(@ApiParam(value = "" ,required=true )  @RequestBody  @Valid UserDTO userDTO) {
        // do some magic!
        LOG.info("Calling login ... ");
        return new ResponseEntity<String>(HttpStatus.OK);
    }

}
