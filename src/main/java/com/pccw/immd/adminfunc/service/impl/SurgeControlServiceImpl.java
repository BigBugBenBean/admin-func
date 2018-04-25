package com.pccw.immd.adminfunc.service.impl;

import com.pccw.immd.adminfunc.domain.SctlSvcCfg;
import com.pccw.immd.adminfunc.dto.SurgeControlViewDTO;
import com.pccw.immd.adminfunc.repository.HibernateUtils;
import com.pccw.immd.adminfunc.repository.SctlSvcCfgRepository;
import com.pccw.immd.adminfunc.service.SurgeControlService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("surgeControlService")
public class SurgeControlServiceImpl implements SurgeControlService {

    private static final Logger LOG = Logger.getLogger(SurgeControlServiceImpl.class);

    private static final String WHERE_CLAUSE = " where ";

    @Autowired
    @Qualifier("sctlSvcCfgRepository.eservice2")
    SctlSvcCfgRepository sctlSvcCfgRepository;

    @Override
    public List<SctlSvcCfg> findAll() {
        return sctlSvcCfgRepository.findAll();
    }

    public List<SctlSvcCfg> searchSearchControl(SurgeControlViewDTO surgeControlViewDTO) {


        return null;
    }
}
