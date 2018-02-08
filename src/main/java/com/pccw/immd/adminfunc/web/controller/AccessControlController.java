package com.pccw.immd.adminfunc.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AccessControlController {

    private static final Logger LOG = LoggerFactory.getLogger(MenuController.class);

    @GetMapping(value = "/accessControl.do")
    public String accessControlPage() {
        return "/eServices2/AccessControl/access-control";
    }

}
