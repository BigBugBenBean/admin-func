package com.pccw.immd.adminfunc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/SMARTICS-2/enquiry")
public class AppointmentBookingEnquiryController {

    @GetMapping(value = "/appointmentBookingEnquiry.do")
    public String appointmentBookSearchPage() {
        return "/Smartics2/AppointmentBookingEnquiry/appointment-booking-enquiry-search";
    }

}
