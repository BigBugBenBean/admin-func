package com.pccw.immd.adminfunc.web.controller;

import com.pccw.immd.adminfunc.domain.VPricePayment;
import com.pccw.immd.adminfunc.dto.ApplicationFeeEnquiryDTO;
import com.pccw.immd.adminfunc.service.ApplicationFeeEnquiryService;
import com.pccw.immd.adminfunc.web.interceptor.BreadcrumbInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static com.pccw.immd.adminfunc.web.interceptor.BreadcrumbInterceptor.FUNC_ID_KEY;

@Controller
public class ApplicationFeeEnquiryController {

    private static final Logger LOG = LoggerFactory.getLogger(ApplicationFeeEnquiryController.class);

    @Autowired
    @Qualifier("applicationFeeEnquiryService")
    private ApplicationFeeEnquiryService applicationFeeEnquiryService;

    @GetMapping(value = "/e-Services-2/enquiry/applicationFeeEnquiry.do")
    public String appFeeEnqPage(HttpServletRequest request, @ModelAttribute ApplicationFeeEnquiryDTO applicationFeeEnquiryDTO) {
        request.setAttribute(FUNC_ID_KEY, BreadcrumbInterceptor.FUNC_ID.Application_Fee_Enquiry);

        List<VPricePayment> list = applicationFeeEnquiryService.listAll();
        if (list.size() > 0) {
            applicationFeeEnquiryDTO.setApplicationCodeList(list);
        }

        return "/eServices2/application-fee-enquiry";
    }

}
