package com.pccw.immd.adminfunc.web.controller;

import com.pccw.immd.adminfunc.web.interceptor.BreadcrumbInterceptor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

import static com.pccw.immd.adminfunc.web.interceptor.BreadcrumbInterceptor.FUNC_ID_KEY;

@Controller
@RequestMapping(value = "/SMARTICS-2/enquiry")
public class AppointmentBookingEnquiryController {

    @GetMapping(value = "/appointmentBookingEnquiry.do")
    public String appointmentBookSearchPage(HttpServletRequest request) {
        request.setAttribute(FUNC_ID_KEY, BreadcrumbInterceptor.FUNC_ID.Appointment_Booking_Enquiry);
        return "/Smartics2/AppointmentBookingEnquiry/appointment-booking-enquiry-search";
    }

    /**
     *  Search by Office and Date
     */

    @GetMapping(value = "/appointmentBookingEnquiry_OfficeResult.do")
    public String appointmentBookOfficeResultPage(HttpServletRequest request) {
        request.setAttribute(FUNC_ID_KEY, BreadcrumbInterceptor.FUNC_ID.Appointment_Booking_Enquiry);
        return "/Smartics2/AppointmentBookingEnquiry/appointment-booking-enquiry-by-office-result";
    }

    /**
     *  Search by Applicant ID
     */

    @GetMapping(value = "/appointmentBookingEnquiry_ApplicantResult.do")
    public String appointmentBookApplicantResultPage(HttpServletRequest request) {
        request.setAttribute(FUNC_ID_KEY, BreadcrumbInterceptor.FUNC_ID.Appointment_Booking_Enquiry);
        return "/Smartics2/AppointmentBookingEnquiry/appointment-booking-enquiry-by-applicant-result";
    }

    @GetMapping(value = "/appointmentBookingEnquiry_ApplicantDetail.do")
    public String appointmentBookApplicantDetailPage(HttpServletRequest request) {
        request.setAttribute(FUNC_ID_KEY, BreadcrumbInterceptor.FUNC_ID.Appointment_Booking_Enquiry);
        return "/Smartics2/AppointmentBookingEnquiry/appointment-booking-enquiry-by-applicant-detail";
    }

    /**
     *  Search by Appointment Type
     */

    @GetMapping(value = "/appointmentBookingEnquiry_AppointmentResult.do")
    public String appointmentBookAppointmentResultPage(HttpServletRequest request) {
        return "/Smartics2/AppointmentBookingEnquiry/appointment-booking-enquiry-by-appointment-result";
    }

}
