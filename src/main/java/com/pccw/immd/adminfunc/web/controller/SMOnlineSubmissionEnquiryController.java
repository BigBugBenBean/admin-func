package com.pccw.immd.adminfunc.web.controller;

import com.pccw.immd.adminfunc.web.interceptor.BreadcrumbInterceptor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

import static com.pccw.immd.adminfunc.web.interceptor.BreadcrumbInterceptor.FUNC_ID_KEY;

@Controller
@RequestMapping(value = "/SMARTICS-2/enquiry")
public class SMOnlineSubmissionEnquiryController {

    @GetMapping(value = "/onlineSubmissionEnquiry.do")
    public String onlineSubmissionSearchPage(HttpServletRequest request) {
        request.setAttribute(FUNC_ID_KEY, BreadcrumbInterceptor.FUNC_ID.SM_Online_Submission_Enquiry);
        return "/Smartics2/OnlineSubmissionEnquiry/online-submission-enquiry-search";
    }

    @GetMapping(value = "/onlineSubmissionEnquiry_Result.do")
    public String onlineSubmissionResultPage(HttpServletRequest request) {
        request.setAttribute(FUNC_ID_KEY, BreadcrumbInterceptor.FUNC_ID.SM_Online_Submission_Enquiry);
        return "/Smartics2/OnlineSubmissionEnquiry/online-submission-enquiry-result";
    }

}
