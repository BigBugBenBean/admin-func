package com.pccw.immd.adminfunc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.pccw.immd.adminfunc.repository.UmAppointment;
import com.pccw.immd.adminfunc.service.AppointmentService;

/**
 * Created by Dell on 24/1/2018.
 */
@Service("appointmentService.eservice2")
public class AppointmentServiceImpl implements AppointmentService {
//    @Autowiredh
//    @Qualifier ("umAppoinmentRepository.eservice2")
    private UmAppointment umAppointment;


}
