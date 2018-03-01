package com.pccw.immd.adminfunc.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SurgeControlController {

    private static final Logger LOG = LoggerFactory.getLogger(MenuController.class);

    @GetMapping(value = "/e-Services-2/maintenance/surgeControl.do")
    public String surgeControlPage() {
        return "/eServices2/SurgeControl/surge-control";
    }

    @GetMapping(value = "/e-Services-2/maintenance/surgeControl_Edit.do")
    public String editSurgeControlPage() {
        return "/eServices2/SurgeControl/edit-surge-control";
    }

    @PostMapping(value = "/e-Services-2/maintenance/surgeControl_Updated.do")
    public String updateSurgeControlPage() {
        return "/eServices2/SurgeControl/surge-control-updated";
    }

}
