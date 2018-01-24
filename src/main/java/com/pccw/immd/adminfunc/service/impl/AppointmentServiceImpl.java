package com.pccw.immd.adminfunc.service.impl;

import com.pccw.immd.adminfunc.domain.Shop;
import com.pccw.immd.adminfunc.repository.UmAppointment;
import com.pccw.immd.adminfunc.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Dell on 24/1/2018.
 */
@Service("appointmentService.eservice2")
public class AppointmentServiceImpl implements AppointmentService {
    @Autowired
    @Qualifier ("umAppoinmentRepository.eservice2")
    private UmAppointment umAppointment;

    @Override
    public List<Shop> testing() {
        List<Shop> shops = umAppointment.findAll();
        return shops;
    }
}
