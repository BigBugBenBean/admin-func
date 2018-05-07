package com.pccw.immd.adminfunc.service;

import com.pccw.immd.adminfunc.domain.AuditLogResult;
import com.pccw.immd.adminfunc.domain.Func;
import com.pccw.immd.adminfunc.dto.AuditLogDTO;

import java.util.List;

/**
 * Created by Dell on 26/2/2018.
 */
public interface AuditLogService {

//    List<AuditLog> listAll();
//    List<AuditLog> listAll(AuditLogDTO auditLog);

    List<AuditLogResult> searchAuditLogList(AuditLogDTO auditLogDTO);
    List<Func> listFunctionList();
}
