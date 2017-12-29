package com.pccw.immd.adminfunc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    @RequestMapping(value = "/index.html", method = RequestMethod.GET)
    public String indexPage() {
        return "index";
    }

    @RequestMapping( value = "/{module}/module.html", method = RequestMethod.GET)
    public String modulePage(
                           @PathVariable("page") String page,
                           @PathVariable("module") String module) {
        System.out.println("module = " + module);
        return "module";
    }
}
