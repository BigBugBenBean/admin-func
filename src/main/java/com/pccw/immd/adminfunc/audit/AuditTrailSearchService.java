package com.pccw.immd.adminfunc.audit;

import com.pccw.immd.adminfunc.annotation.AccessAudit;
import com.pccw.immd.adminfunc.dto.LoginUser;
import org.springframework.transaction.annotation.Transactional;

public interface AuditTrailSearchService {

    @Transactional
    void log(String reqSessionId, LoginUser loginUser, String funcId, AccessAudit.AccessActionType actionType);
}