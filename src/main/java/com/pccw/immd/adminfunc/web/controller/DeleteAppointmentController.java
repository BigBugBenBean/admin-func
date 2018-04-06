package com.pccw.immd.adminfunc.web.controller;

import com.pccw.immd.adminfunc.web.interceptor.BreadcrumbInterceptor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

import static com.pccw.immd.adminfunc.web.interceptor.BreadcrumbInterceptor.FUNC_ID_KEY;

@Controller
@RequestMapping(value = "/SMARTICS-2/maintenance")
public class DeleteAppointmentController {

    @GetMapping(value = "/deleteAppointment.do")
    public String deleteAppointmentSearchPage(HttpServletRequest request) {
        request.setAttribute(FUNC_ID_KEY, BreadcrumbInterceptor.FUNC_ID.Delete_Appointment);
        return "/Smartics2/DeleteAppointment/delete-appointment-search";
    }

    @GetMapping(value = "/deleteAppointment_Result.do")
    public String deleteAppointmentResultPage(HttpServletRequest request) {
        request.setAttribute(FUNC_ID_KEY, BreadcrumbInterceptor.FUNC_ID.Delete_Appointment);
        return "/Smartics2/DeleteAppointment/delete-appointment-result";
    }

    @GetMapping(value = "/deleteAppointment_ResultSuccess.do")
    public String deleteAppointmentResultSuccessPage(HttpServletRequest request) {
        request.setAttribute(FUNC_ID_KEY, BreadcrumbInterceptor.FUNC_ID.Delete_Appointment);
        return "/Smartics2/DeleteAppointment/delete-appointment-result-success";
    }

}
