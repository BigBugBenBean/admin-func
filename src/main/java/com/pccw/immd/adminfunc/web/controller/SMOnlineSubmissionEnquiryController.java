package com.pccw.immd.adminfunc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/SMARTICS-2/enquiry")
public class SMOnlineSubmissionEnquiryController {

    @GetMapping(value = "/onlineSubmissionEnquiry.do")
    public String onlineSubmissionSearchPage() {
        return "/Smartics2/OnlineSubmissionEnquiry/online-submission-enquiry-search";
    }

}
