package com.pccw.immd.adminfunc.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ApplicationFeeEnquiry {

    private static final Logger LOG = LoggerFactory.getLogger(IndexController.class);

    @GetMapping(value = "/applicationFeeEnquiry.html")
    public String appFeeEnqPage() {
        return "/eServices2/application-fee-enquiry";
    }

}
