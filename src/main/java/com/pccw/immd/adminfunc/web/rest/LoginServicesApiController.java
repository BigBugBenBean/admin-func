package com.pccw.immd.adminfunc.web.rest;

import com.pccw.immd.adminfunc.web.rest.intr.LoginServicesApi;
import com.pccw.immd.adminfunc.dto.UserDTO;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-01T03:56:21.323Z")

@RestController
public class LoginServicesApiController implements LoginServicesApi {

    private static final Logger LOG = LoggerFactory.getLogger(LoginServicesApiController.class);

    public UpmsUser login(@ApiParam(value = "" ,required=true )  @RequestBody  @Valid UserDTO userDTO) {
        // do some magic!
        LOG.info("Calling login ... ");
        UpmsUser user = new UpmsUser();
        user.setName("Test Ricky");
        user.setAge(18);
        return user;
    }

    public class UpmsUser{
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

}
