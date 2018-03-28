package com.pccw.immd.adminfunc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/SMARTICS-2/maintenance")
public class DeleteAppointmentController {

    @GetMapping(value = "/deleteAppointment.do")
    public String deleteAppointmentSearchPage() {
        return "/Smartics2/DeleteAppointment/delete-appointment-search";
    }

    @GetMapping(value = "/deleteAppointment_Result.do")
    public String deleteAppointmentResultPage() {
        return "/Smartics2/DeleteAppointment/delete-appointment-result";
    }

    @GetMapping(value = "/deleteAppointment_ResultSuccess.do")
    public String deleteAppointmentResultSuccessPage() {
        return "/Smartics2/DeleteAppointment/delete-appointment-result-success";
    }

}
