package com.pccw.immd.adminfunc.service.impl;

import com.pccw.immd.adminfunc.annotation.AccessAudit;
import com.pccw.immd.adminfunc.domain.SystemHoliday;
import com.pccw.immd.adminfunc.dto.UpmsUser;
import com.pccw.immd.adminfunc.repository.UmSystemHolidayRepository;
import com.pccw.immd.adminfunc.service.SystemHolidayService;
import com.pccw.immd.adminfunc.service.UmpsEndPointService;
import com.pccw.immd.adminfunc.service.UmpsEndPointServiceWithHeader;
import com.pccw.immd.adminfunc.service.UpmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ws.upms.immd.v1.ITIAppException;
import ws.upms.immd.v1.ITISysException;
import ws.upms.immd.v1.Iss3UserSignOnDTO;

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
