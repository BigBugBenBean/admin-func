package com.pccw.immd.adminfunc.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SurgeControlController {

    private static final Logger LOG = LoggerFactory.getLogger(MenuController.class);

    @GetMapping(value = "/surgeControl.do")
    public String surgeControlPage() {
        return "/eServices2/SurgeControl/surge-control";
    }

    @GetMapping(value = "/editSurgeControl.do")
    public String editSurgeControlPage() {
        return "/eServices2/SurgeControl/edit-surge-control";
    }

}
