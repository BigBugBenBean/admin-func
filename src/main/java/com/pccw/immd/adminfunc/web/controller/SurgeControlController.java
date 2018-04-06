package com.pccw.immd.adminfunc.web.controller;

import com.pccw.immd.adminfunc.web.interceptor.BreadcrumbInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

import static com.pccw.immd.adminfunc.web.interceptor.BreadcrumbInterceptor.FUNC_ID_KEY;

@Controller
public class SurgeControlController {

    private static final Logger LOG = LoggerFactory.getLogger(MenuController.class);

    @GetMapping(value = "/e-Services-2/maintenance/surgeControl.do")
    public String surgeControlPage(HttpServletRequest request) {
        request.setAttribute(FUNC_ID_KEY, BreadcrumbInterceptor.FUNC_ID.Surge_Control);
        return "/eServices2/SurgeControl/surge-control";
    }

    @GetMapping(value = "/e-Services-2/maintenance/surgeControl_Edit.do")
    public String editSurgeControlPage(HttpServletRequest request) {
        request.setAttribute(FUNC_ID_KEY, BreadcrumbInterceptor.FUNC_ID.Surge_Control);
        return "/eServices2/SurgeControl/edit-surge-control";
    }

    @PostMapping(value = "/e-Services-2/maintenance/surgeControl_Updated.do")
    public String updateSurgeControlPage(HttpServletRequest request) {
        request.setAttribute(FUNC_ID_KEY, BreadcrumbInterceptor.FUNC_ID.Surge_Control);
        return "/eServices2/SurgeControl/surge-control-updated";
    }

}
