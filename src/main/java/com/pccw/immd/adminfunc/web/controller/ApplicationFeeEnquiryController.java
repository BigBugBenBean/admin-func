package com.pccw.immd.adminfunc.web.controller;

import com.pccw.immd.adminfunc.domain.ApplicationCode;
import com.pccw.immd.adminfunc.dto.ApplicationFeeEnquiryDTO;
import com.pccw.immd.adminfunc.service.ApplicationFeeEnquiryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class ApplicationFeeEnquiryController {

    private static final Logger LOG = LoggerFactory.getLogger(ApplicationFeeEnquiryController.class);

    @Autowired
    @Qualifier("applicationFeeEnquiryService")
    private ApplicationFeeEnquiryService applicationFeeEnquiryService;

    @GetMapping(value = "/e-Services-2/enquiry/applicationFeeEnquiry.do")
    public String appFeeEnqPage(@ModelAttribute ApplicationFeeEnquiryDTO applicationFeeEnquiryDTO) {

        List<ApplicationCode> list = applicationFeeEnquiryService.listAll();
        if (list.size() > 0) {
            applicationFeeEnquiryDTO.setApplicationCodeList(list);
        }

        return "/eServices2/application-fee-enquiry";
    }

}
