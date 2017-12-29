package com.pccw.immd.adminfunc.web.rest;

import com.pccw.immd.adminfunc.web.rest.intr.TestAPI;
import com.pccw.immd.adminfunc.dto.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created by vagrant on 5/10/17.
 */
@RestController
@RequestMapping(value = "/")
public class TestController implements TestAPI {

    private static final Logger LOG = LoggerFactory.getLogger(TestController.class);


//    @Autowired
//    AssessmentService assessmentService;



    @RequestMapping(value = "/saveUser",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.POST)
    public ResponseEntity<String> saveUser(@RequestBody @Valid UserDTO body) throws Exception {
        return new ResponseEntity<>(new String ("success"), HttpStatus.OK);
    }
}
