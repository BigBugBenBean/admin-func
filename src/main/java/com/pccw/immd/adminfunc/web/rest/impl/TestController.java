package com.pccw.immd.adminfunc.web.rest.impl;

import com.pccw.immd.adminfunc.domain.Shop;
import com.pccw.immd.adminfunc.dto.UserDTO;
import com.pccw.immd.adminfunc.service.AppointmentService;
import com.pccw.immd.adminfunc.web.rest.TestAPI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by vagrant on 5/10/17.
 */
@RestController
@RequestMapping(value = "/testing")
public class TestController implements TestAPI {

    private static final Logger LOG = LoggerFactory.getLogger(TestController.class);

    @Autowired
    @Qualifier ("appointmentService.eservice2")
    private AppointmentService appointmentService;

    public List<Shop> testing(@RequestBody @Valid UserDTO body) throws Exception {
        return appointmentService.testing();
    }

    public ResponseEntity<String> saveUser(@RequestBody @Valid UserDTO body) throws Exception {

        return new ResponseEntity<>(new String ("success"), HttpStatus.OK);
    }
}
