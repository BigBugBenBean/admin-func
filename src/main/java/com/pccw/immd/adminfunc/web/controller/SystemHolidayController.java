package com.pccw.immd.adminfunc.web.controller;

import com.pccw.immd.adminfunc.annotation.AccessAudit;
import com.pccw.immd.adminfunc.dto.SystemHolidayDTO;
import com.pccw.immd.adminfunc.service.SystemHolidayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class SystemHolidayController {

    private static final Logger LOG = LoggerFactory.getLogger(SystemHolidayController.class);

    @Autowired
    @Qualifier("systemHolidayService")
    private SystemHolidayService systemHolidayService;

    @AccessAudit()
    @GetMapping(value = "/e-Services-2/enquiry/systemHoliday.do")
    public String systemHolidayPage(@ModelAttribute SystemHolidayDTO systemHolidayDTO) {
        systemHolidayDTO.setSystemHolidayList(systemHolidayService.listAll());
        return "/eServices2/SystemHoliday/system-holiday";
    }

}
