package com.pccw.immd.adminfunc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/e-Services-2/maintenance")
public class IVRSController {

    @GetMapping(value = "/ivrs.do")
    public String ivrsPage() {
        return "/eServices2/IVRS/ivrs";
    }

}
