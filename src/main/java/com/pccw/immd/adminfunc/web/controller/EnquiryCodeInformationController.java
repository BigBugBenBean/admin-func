package com.pccw.immd.adminfunc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/SMARTICS-2/enquiry")
public class EnquiryCodeInformationController {

    @GetMapping(value = "/enquiryCodeInformation.do")
    public String onlineSubmissionSearchPage() {
        return "/Smartics2/EnquiryCodeInformation/enquiry-code-info-search";
    }

    @GetMapping(value = "/enquiryCodeInformation_Result.do")
    public String onlineSubmissionResultPage() {
        return "/Smartics2/EnquiryCodeInformation/enquiry-code-info-result";
    }

}
