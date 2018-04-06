package com.pccw.immd.adminfunc.web.controller;

import com.pccw.immd.adminfunc.web.interceptor.BreadcrumbInterceptor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

import static com.pccw.immd.adminfunc.web.interceptor.BreadcrumbInterceptor.FUNC_ID_KEY;

@Controller
@RequestMapping(value = "/SMARTICS-2/enquiry")
public class EnquiryCodeInformationController {

    @GetMapping(value = "/enquiryCodeInformation.do")
    public String onlineSubmissionSearchPage(HttpServletRequest request) {
        request.setAttribute(FUNC_ID_KEY, BreadcrumbInterceptor.FUNC_ID.Enquiry_Code_Information);
        return "/Smartics2/EnquiryCodeInformation/enquiry-code-info-search";
    }

    @GetMapping(value = "/enquiryCodeInformation_Result.do")
    public String onlineSubmissionResultPage(HttpServletRequest request) {
        request.setAttribute(FUNC_ID_KEY, BreadcrumbInterceptor.FUNC_ID.Enquiry_Code_Information);
        return "/Smartics2/EnquiryCodeInformation/enquiry-code-info-result";
    }

}
