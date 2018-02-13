package com.pccw.immd.adminfunc.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SystemHolidayController {

    private static final Logger LOG = LoggerFactory.getLogger(SystemHolidayController.class);

    @GetMapping(value = "/systemHoliday.do")
    public String accessControlPage() {
        return "/eServices2/SystemHoliday/system-holiday";
    }

}
