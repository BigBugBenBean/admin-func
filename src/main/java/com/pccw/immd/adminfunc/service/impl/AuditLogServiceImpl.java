package com.pccw.immd.adminfunc.service.impl;

import com.pccw.immd.adminfunc.domain.AuditLog;
import com.pccw.immd.adminfunc.repository.HibernateUtils;
import com.pccw.immd.adminfunc.service.AuditLogService;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

/**
 * Created by Dell on 13/2/2018.
 */
@Service("auditLogService.eservice2")
public class AuditLogServiceImpl implements AuditLogService {

    @Override
    public List<AuditLog> listAll() {
        Order order = Order.asc("auditTrailId");

        List<AuditLog> auditLogList = HibernateUtils.listByDomain(AuditLog.class, order);
        auditLogList.sort(new Comparator<AuditLog>() {
            @Override
            public int compare(AuditLog auditLog1, AuditLog auditLog2) {
                return auditLog1.getAuditTrailId() > auditLog2.getAuditTrailId() ? -1 :
                        auditLog1.getAuditTrailId() == auditLog2.getAuditTrailId() ? 0 : 1;
            }
        });
        return auditLogList;
    }
}
