package com.pccw.immd.adminfunc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/RM/enquiry")
public class RMOnlineSubmissionEnquiryController {

    @GetMapping(value = "/onlineSubmissionEnquiry.do")
    public String onlineSubmissionSearchPage() {
        return "/RM/OnlineSubmissionEnquiry/online-submission-enquiry-search";
    }

    @GetMapping(value = "/onlineSubmissionEnquiry_Result.do")
    public String onlineSubmissionResultPage() {
        return "/RM/OnlineSubmissionEnquiry/online-submission-enquiry-result";
    }

}
