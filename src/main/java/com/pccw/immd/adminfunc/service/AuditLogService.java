package com.pccw.immd.adminfunc.service;

import com.pccw.immd.adminfunc.domain.AuditLog;
import com.pccw.immd.adminfunc.dto.AuditLogDTO;

import java.util.List;

/**
 * Created by Dell on 26/2/2018.
 */
public interface AuditLogService {

    List<AuditLog> listAll();

    List<AuditLog> listAll(AuditLogDTO auditLog);

}
