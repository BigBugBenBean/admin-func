package com.pccw.immd.adminfunc.service.impl;

import com.pccw.immd.adminfunc.domain.SctlSvcCfg;
import com.pccw.immd.adminfunc.domain.SctlTrend;
import com.pccw.immd.adminfunc.dto.SurgeControlView;
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
import java.util.List;

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

    @Override
    public List<SurgeControlView> searchSurgeControl (SurgeControlViewDTO surgeControlViewDTO) {
        String sctlSvcCfg = "ssc";
        String sctlTrend = "st";
        String hql = "from SctlSvcCfg as " + sctlSvcCfg
                + ", SctlTrend as " + sctlTrend;


        hql += " WHERE "
                + " " + sctlSvcCfg + ".svcId = " + sctlTrend + ".id.svcId ";

        String whereClause = "";
        if (surgeControlViewDTO.getSvcId() != null && !surgeControlViewDTO.getSvcId().equals("")) {
            whereClause += " and " + sctlSvcCfg + ".svcId like '%" + surgeControlViewDTO.getSvcId() + "%' ";
        }
        if (surgeControlViewDTO.getGst() != null && !surgeControlViewDTO.getGst().equals("")) {
            whereClause += " and " + sctlSvcCfg + ".gst like '%" + surgeControlViewDTO.getGst() + "%' ";
        }
        if (surgeControlViewDTO.getSvcDesc() != null && !surgeControlViewDTO.getSvcDesc().equals("")) {
            whereClause += " and " + sctlSvcCfg + ".svcDesc like '" + surgeControlViewDTO.getSvcDesc() + "%' ";
        }
        if (surgeControlViewDTO.getMst() != null && !surgeControlViewDTO.getMst().equals("")) {
            whereClause += " and " + sctlSvcCfg + ".mst like '%" + surgeControlViewDTO.getMst() + "%' ";
        }
        if (surgeControlViewDTO.getPriority() != null && !surgeControlViewDTO.getPriority().equals("")) {
            whereClause += " and " + sctlSvcCfg + ".priority like '%" + surgeControlViewDTO.getMst() + "%' ";

        }
        if (surgeControlViewDTO.getClawback() != null && !surgeControlViewDTO.getClawback().equals("")) {
            whereClause += " and " + sctlSvcCfg + ".clawback like '%" + surgeControlViewDTO.getClawback() + "%' ";
        }

        hql += whereClause;
        EntityManager em = HibernateUtils.getEm();
        Query query = em.createQuery(hql);
        List<?> list = query.getResultList();

        List<SurgeControlView> searchResultList = new ArrayList<>();
        for (int i =0; i < list.size(); i++) {
            SurgeControlView scv = new SurgeControlView();
            Object[] objects = (Object[]) list.get(i);
            for (Object obj: objects) {
                if (obj instanceof SctlSvcCfg) {
                    scv.setSctlSvcCfg((SctlSvcCfg) obj);
                } else if (obj instanceof SctlTrend) {
                    scv.setSctlTrend((SctlTrend) obj);
                }
            }
            searchResultList.add(scv);
        }
        return searchResultList;
    }
}
