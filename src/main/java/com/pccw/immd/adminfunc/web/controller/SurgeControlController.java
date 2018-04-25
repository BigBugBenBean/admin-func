package com.pccw.immd.adminfunc.web.controller;

import com.pccw.immd.adminfunc.domain.SctlSvcCfg;
import com.pccw.immd.adminfunc.dto.ApplicationFeeEnquiryDTO;
import com.pccw.immd.adminfunc.dto.SurgeControlDto;
import com.pccw.immd.adminfunc.dto.SurgeControlViewDTO;
import com.pccw.immd.adminfunc.service.SurgeControlService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

import java.util.List;

import static com.pccw.immd.adminfunc.web.interceptor.BreadcrumbInterceptor.FUNC_ID_KEY;

@Controller
public class SurgeControlController {

    private static final Logger LOG = LoggerFactory.getLogger(SurgeControlController.class);

    @Autowired
    @Qualifier("surgeControlService")
    private SurgeControlService surgeControlService;

    @GetMapping(value = "/e-Services-2/maintenance/surgeControl.do")
    public String surgeControlPage(HttpServletRequest request,
                                   @ModelAttribute("testJson") SurgeControlDto testJson){
        testJson.setAddress("testing ---- Address");
        testJson.setName("T_ name ");
        return "/eServices2/SurgeControl/surge-control";
    }

    @PostMapping(value = "/e-Services-2/maintenance/surgeControlSearchResult.do")
    public String surgeControlSearchResult(HttpServletRequest request, @ModelAttribute SurgeControlViewDTO surgeControlViewDTO) {

        LOG.info("SurgeControlView: " + surgeControlViewDTO);
        List<SctlSvcCfg> serviceList = surgeControlService.searchSearchControl(surgeControlViewDTO);
        if (serviceList.size() > 0) {
            surgeControlViewDTO.setSurgeControlViewList(serviceList);
        }

        return "/eServices2/SurgeControl/surge-control-search-result";
    }

    @GetMapping(value = "/e-Services-2/maintenance/surgeControl_Edit.do")
    public String editSurgeControlPage(HttpServletRequest request) {
        return "/eServices2/SurgeControl/edit-surge-control";
    }

    @PostMapping(value = "/e-Services-2/maintenance/surgeControl_Updated.do")
    public String updateSurgeControlPage(HttpServletRequest request) {
        return "/eServices2/SurgeControl/surge-control-updated";
    }

}
