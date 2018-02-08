package com.pccw.immd.adminfunc.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import com.pccw.immd.adminfunc.service.AppointmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.pccw.immd.adminfunc.dto.UpmsUser;
import com.pccw.immd.adminfunc.dto.UserDTO;
import com.pccw.immd.adminfunc.dto.UserDTO3;
import com.pccw.immd.adminfunc.service.UpmsService;
import com.pccw.immd.adminfunc.web.rest.AuthApi;
import com.pccw.immd.adminfunc.ws.upms.cxf.ITIAppException;
import com.pccw.immd.adminfunc.ws.upms.cxf.ITISysException;

import io.swagger.annotations.ApiParam;

@Controller
public class MenuController {

    private static final Logger LOG = LoggerFactory.getLogger(MenuController.class);

    @RequestMapping(value = "/menu.html", method = RequestMethod.GET)
    public String menuPage() {
        return "menu";
    }

    @PostMapping(value = "/navMenu")
    public String navMenu(@RequestBody Object page) {
        LOG.info("navMenu~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        LOG.info("page: " + page);
        return "redirect:/AUTH/login-form.html";
    }


}
