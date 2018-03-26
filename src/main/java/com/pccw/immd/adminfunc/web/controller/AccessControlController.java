package com.pccw.immd.adminfunc.web.controller;

import com.pccw.immd.adminfunc.domain.AccessControl;
import com.pccw.immd.adminfunc.domain.AccessControlGlobalParam;
import com.pccw.immd.adminfunc.dto.AccessControlCreateDTO;
import com.pccw.immd.adminfunc.dto.AccessControlDTO;
import com.pccw.immd.adminfunc.dto.AccessControlGlobalParamsDTO;
import com.pccw.immd.adminfunc.service.AccessControlService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Controller
public class AccessControlController {

    private static final Logger LOG = LoggerFactory.getLogger(AccessControlController.class);

    public static final String BLACKLIST = "Black";
    public static final String WHITELIST = "White";

    @Autowired
    @Qualifier("accessControlService.eservice2")   private AccessControlService accessControlService;

    @GetMapping(value = "/e-Services-2/maintenance/accessControl.do")
    public String accessControlPage(@ModelAttribute AccessControlDTO accessControlDTO) {
        List<AccessControl> list = accessControlService.listAll();
        
        if (list.size() > 0) {
            accessControlDTO.setAccessControlList(list);
        }

        return "/AccessControl/access-control";
    }

    @GetMapping(value = "/e-Services-2/maintenance/accessControl_Global.do")
    public String accessControlGlobalPage(@ModelAttribute AccessControlDTO accessControlDTO) {
        List<AccessControlGlobalParam> params = accessControlService.getGlobalParam();

        if (params.size() > 0) {
            accessControlDTO.setAccessControlGlobalParamList(params);
        }

        return "/eServices2/AccessControl/access-control-global";
    }

    @PostMapping(value = "/e-Services-2/maintenance/accessControl_GlobalParamsSave.do")
    public String saveAccessControlGlobalParams(@ModelAttribute AccessControlGlobalParamsDTO accessControlGlobalParamsDTO) {

        accessControlService.updateGlobalParam(accessControlGlobalParamsDTO);

        return "/eServices2/AccessControl/access-control-global-success";
    }

    @PostMapping(value = "/e-Services-2/maintenance/accessControl_CreateSave.do")
    public String accessControlCreateSave(@ModelAttribute AccessControlCreateDTO accessControlCreateDTO) {

        String fromYear = accessControlCreateDTO.getEffectiveFromYear();
        String fromMonth = accessControlCreateDTO.getEffectiveFromMonth();
        String fromDay = accessControlCreateDTO.getEffectiveFromDay();
        String fromHour = accessControlCreateDTO.getEffectiveFromHour();
        String fromMin = accessControlCreateDTO.getEffectiveFromMinute();
        String fromSec = accessControlCreateDTO.getEffectiveFromSecond();

        String toYear = accessControlCreateDTO.getEffectiveToYear();
        String toMonth = accessControlCreateDTO.getEffectiveToMonth();
        String toDay = accessControlCreateDTO.getEffectiveToDay();
        String toHour = accessControlCreateDTO.getEffectiveToHour();
        String toMin = accessControlCreateDTO.getEffectiveToMinute();
        String toSec = accessControlCreateDTO.getEffectiveToSecond();


        Date fromDate = convertDateFromInput(fromYear, fromMonth, fromDay, fromHour, fromMin, fromSec);
        Date toDate = convertDateFromInput(toYear, toMonth, toDay, toHour, toMin, toSec);

        accessControlCreateDTO.setEffectiveFrom(fromDate);
        accessControlCreateDTO.setEffectiveTo(toDate);

        if (accessControlCreateDTO.getType().equals(BLACKLIST)) {
            accessControlService.createBlackList(accessControlCreateDTO);
        } else if (accessControlCreateDTO.getType().equals(WHITELIST)) {
            accessControlService.createWhiteList(accessControlCreateDTO);
        } else {
            setDefaultEffectiveDateField(accessControlCreateDTO);
        }

        return "/eServices2/AccessControl/access-control-create-success";
    }

    @GetMapping(value = "/e-Services-2/maintenance/accessControl_Create.do")
    public String accessControlCreatePage() {
        return "/eServices2/AccessControl/access-control-create";
    }

    @PostMapping(value = "/e-Services-2/maintenance/accessControl_CreateSuccess.do")
    public String accessControlCreateSuccessPage(@ModelAttribute AccessControlCreateDTO accessControlCreateDTO) {
        return "/eServices2/AccessControl/access-control-create-success";
    }

    @GetMapping(value = "/e-Services-2/maintenance/accessControl_View.do")
    public String accessControlViewPage(@ModelAttribute AccessControlCreateDTO accessControlCreateDTO) {
        return "/eServices2/AccessControl/access-control-view";
    }


    private Date convertDateFromInput(String year, String month, String day_of_month, String hour, String minuite, String second) {

        Integer _year = Integer.parseInt(year);
        Integer _month = Integer.parseInt(month);
        Integer _day_of_month = Integer.parseInt(day_of_month);
        Integer _hour = Integer.parseInt(hour);
        Integer _minuite = Integer.parseInt(minuite);
        Integer _second = Integer.parseInt(second);

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, _year);
        cal.set(Calendar.MONTH, --_month);       // 0 is Jan, 11 is Dec
        cal.set(Calendar.DAY_OF_MONTH, _day_of_month);
        cal.set(Calendar.HOUR, _hour);
        cal.set(Calendar.MINUTE, _minuite);
        cal.set(Calendar.SECOND, _second);
        cal.set(Calendar.MILLISECOND, 0);

        Date date = cal.getTime();

        return date;
    }

    private void setDefaultEffectiveDateField(AccessControlCreateDTO accessControlCreateDTO) {
        Calendar cal = Calendar.getInstance();
        Date date = new Date();

        cal.setTime(date);
        cal.add(Calendar.DAY_OF_MONTH, 1);



        String fromYear = String.valueOf(cal.get(Calendar.YEAR));
        String fromMonth = String.valueOf(cal.get(Calendar.MONTH));
        String fromDay = String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
        String fromHour = "00";
        String fromMin = "00";
        String fromSec = "00";

        Date fromDate = convertDateFromInput(fromYear, fromMonth, fromDay, fromHour, fromMin, fromSec);

        accessControlCreateDTO.setEffectiveFrom(fromDate);
        accessControlCreateDTO.setEffectiveTo(null);
    }

}
