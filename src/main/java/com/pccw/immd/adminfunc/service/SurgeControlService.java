package com.pccw.immd.adminfunc.service;

import com.pccw.immd.adminfunc.domain.SctlSvcCfg;
import com.pccw.immd.adminfunc.dto.SurgeControlViewDTO;

import java.util.List;

public interface SurgeControlService {

    List<SctlSvcCfg> findAll();

    List<SctlSvcCfg> searchSearchControl(SurgeControlViewDTO surgeControlViewDTO);
}
