package com.pccw.immd.adminfunc.service.impl;

import com.pccw.immd.adminfunc.domain.SystemHoliday;
import com.pccw.immd.adminfunc.repository.UmSystemHolidayRepository;
import com.pccw.immd.adminfunc.service.SystemHolidayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("systemHolidayService")
public class SystemHolidayServiceImpl implements SystemHolidayService {

    @Autowired
    @Qualifier ("umSystemHolidayRepository.eservice2")
    private UmSystemHolidayRepository umSystemHolidayRepository;

    @Override
    public List<SystemHoliday> listAll() {
        return umSystemHolidayRepository.findAllByOrderByHolidayDateAsc();
    }
}
