package com.pccw.immd.adminfunc.web.controller;

import com.pccw.immd.adminfunc.dto.LoginUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;

@Controller
public class IndexController {
	
	private static final Logger LOG = LoggerFactory.getLogger(IndexController.class);

    @GetMapping(value = "/index.html")
    public String indexPage(){
        return "index";
    }

    @RequestMapping( value = "/{module}/module.html", method = RequestMethod.GET)
    public String modulePage(
                           @PathVariable("page") String page,
                           @PathVariable("module") String module) {
    	LOG.debug("module = " + module);
        return "module";
    }
}
