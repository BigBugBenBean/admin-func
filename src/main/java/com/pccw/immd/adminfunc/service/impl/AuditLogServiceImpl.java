package com.pccw.immd.adminfunc.service.impl;

import com.pccw.immd.adminfunc.domain.AuditAccess;
import com.pccw.immd.adminfunc.domain.AuditAccessSearch;
import com.pccw.immd.adminfunc.domain.AuditLogResult;
import com.pccw.immd.adminfunc.domain.Func;
import com.pccw.immd.adminfunc.dto.AuditLogDTO;
import com.pccw.immd.adminfunc.repository.HibernateUtils;
import com.pccw.immd.adminfunc.service.AuditLogService;
import com.pccw.immd.adminfunc.web.controller.AuditLogController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Dell on 13/2/2018.
 */
@Service("auditLogService.eservice2")
public class AuditLogServiceImpl implements AuditLogService {

    private static final Logger LOG = LoggerFactory.getLogger(AuditLogController.class);

//    @Override
//    public List<AuditLog> listAll() {
//        Order order = Order.asc("auditTrailId");
//        List<AuditLog> auditLogList = HibernateUtils.listByDomain(AuditLog.class, order);
//        auditLogList.sort(new Comparator<AuditLog>() {
//            @Override
//            public int compare(AuditLog auditLog1, AuditLog auditLog2) {
//                return auditLog1.getAuditTrailId() > auditLog2.getAuditTrailId() ? -1 :
//                        auditLog1.getAuditTrailId() == auditLog2.getAuditTrailId() ? 0 : 1;
//            }
//        });
//        return auditLogList;
//    }


//    @Override
//    public List<AuditLog> listAll(AuditLogDTO auditLogDTO) {
//        String hql = "from AuditTrailSearch als";
//        Map<String, Object> params = new HashMap<>();
//        hql += getWhereClause(auditLogDTO, params);
//
//        List<AuditLog> auditLogList = HibernateUtils.listByHQL(hql, params);
//        auditLogList.sort(new Comparator<AuditLog>() {
//            @Override
//            public int compare(AuditLog auditLog1, AuditLog auditLog2) {
//                return auditLog1.getAuditTrailId() > auditLog2.getAuditTrailId() ? -1 :
//                        auditLog1.getAuditTrailId() == auditLog2.getAuditTrailId() ? 0 : 1;
//            }
//        });
//        return auditLogList;
//    }

    private static final String WHERE_CLAUSE = " where ";

//    private String getWhereClause(AuditLogDTO auditLogDTO, Map<String, Object> params) {
//        String whereClause = "";
//        if (auditLogDTO.getFuncId() != null || auditLogDTO.getUserId() != null
//                || auditLogDTO.getStartDate() != null || auditLogDTO.getEndDate() != null){
//            if (auditLogDTO.getFuncId() != null && auditLogDTO.getFuncId().trim().length() > 0 ){
//                whereClause += "and als.funcId = :funcId ";
//                params.put("funcId", auditLogDTO.getFuncId());
//            }
//            if (auditLogDTO.getUserId() != null && auditLogDTO.getUserId().trim().length() > 0 ){
//                whereClause += "and als.userId = :userId ";
//                params.put("userId", auditLogDTO.getUserId());
//            }
//
//
//            if (auditLogDTO.getStartDate() != null ){
//                whereClause += "and als.logDatetime >= :startDate ";
//                params.put("startDate", auditLogDTO.getStartDate());
//            }
//
//            if ( auditLogDTO.getEndDate() != null){
//                whereClause += "and als.logDatetime <= :endDate";
//                params.put("endDate", auditLogDTO.getEndDate());
//            }
//        }
//        return whereClause.trim().length() == 0? "" : WHERE_CLAUSE + whereClause.substring(3);
//    }

    @Override
    public List<Func> listFunctionList() {
        List<Func> list;

        String hql = " from Func ";

        EntityManager em = HibernateUtils.getEm();
        Query query = em.createQuery(hql);
        list = query.getResultList();

        return list;
    }

    @Override
    public List<AuditLogResult> searchAuditLogList(AuditLogDTO auditLogDTO) {
        String adAccessName = "ua";
        String adAccessSearchName = "uas";

        String hql = "from AuditAccess as " + adAccessName
                + " , AuditAccessSearch as " + adAccessSearchName;

        hql += " WHERE "
                + "  " + adAccessName + ".accessId = " + adAccessSearchName + ".accessId  ";

        Map<String, Object> params = new HashMap<>();

        //
        String whereClause = "";

        if (auditLogDTO.getFuncId() != null) {
            whereClause += " and " + adAccessName + ".funcId = :funcId ";
            params.put("funcId", auditLogDTO.getFuncId());
        }
        if (auditLogDTO.getUserId() != null) {

        }
        if (auditLogDTO.getStartDate() != null) {
            whereClause += " and " + adAccessName + ".logDatetime >= :startDate ";
            params.put("startDate", auditLogDTO.getStartDate());
        }
        if (auditLogDTO.getEndDate() != null) {
            whereClause += " and " + adAccessName + ".logDatetime <= :endDate";
            params.put("endDate", auditLogDTO.getEndDate());
        }

        hql += whereClause;


        List<?> tmpList = HibernateUtils.listByHQL(hql, params);

        // combine object
        List<AuditLogResult> viewList = new ArrayList<>();
        for (int i =0; i < tmpList.size(); i++) {
            AuditLogResult newObj = new AuditLogResult();
            Object[] objects = (Object[]) tmpList.get(i);
            for (Object obj: objects) {
                if (obj instanceof AuditAccess) {
                    newObj.setAuditAccess((AuditAccess)obj);
                } else if (obj instanceof AuditAccessSearch) {
                    newObj.setAuditAccessSearch((AuditAccessSearch)obj);
                }
            }
            viewList.add(newObj);
        }

        LOG.debug("tmpList: " + tmpList.size());

        return viewList;
    }


}
