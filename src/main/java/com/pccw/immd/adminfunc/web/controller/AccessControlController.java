package com.pccw.immd.adminfunc.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AccessControlController {

    private static final Logger LOG = LoggerFactory.getLogger(AccessControlController.class);

    @GetMapping(value = "/accessControl.do")
    public String accessControlPage() {
        return "/eServices2/AccessControl/access-control";
    }

    @GetMapping(value = "/accessControlGlobal.do")
    public String accessControlGlobalPage() {
        return "/eServices2/AccessControl/access-control-global";
    }

    @GetMapping(value = "/accessControlGlobalSuccess.do")
    public String accessControlGlobalSuccessPage() {
        return "/eServices2/AccessControl/access-control-global-success";
    }

    @GetMapping(value = "/createAccessControl.do")
    public String accessControlCreatePage() {
        return "/eServices2/AccessControl/access-control-create";
    }

    @GetMapping(value = "/createAccessControlSuccess.do")
    public String accessControlCreateSuccessPage() {
        return "/eServices2/AccessControl/access-control-create-success";
    }

    @GetMapping(value = "/accessControlView.do")
    public String accessControlViewPage() {
        return "/eServices2/AccessControl/access-control-view";
    }

}
