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

    /**
     *  Search by Office and Date
     */

    @GetMapping(value = "/appointmentBookingEnquiry_OfficeResult.do")
    public String appointmentBookOfficeResultPage() {
        return "/Smartics2/AppointmentBookingEnquiry/appointment-booking-enquiry-by-office-result";
    }

    /**
     *  Search by Applicant ID
     */

    @GetMapping(value = "/appointmentBookingEnquiry_ApplicantResult.do")
    public String appointmentBookApplicantResultPage() {
        return "/Smartics2/AppointmentBookingEnquiry/appointment-booking-enquiry-by-applicant-result";
    }

    /**
     *  Search by Appointment Type
     */

    @GetMapping(value = "/appointmentBookingEnquiry_AppointmentResult.do")
    public String appointmentBookAppointmentResultPage() {
        return "/Smartics2/AppointmentBookingEnquiry/appointment-booking-enquiry-by-appointment-result";
    }

}
