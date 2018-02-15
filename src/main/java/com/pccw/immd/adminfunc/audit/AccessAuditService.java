package com.pccw.immd.adminfunc.audit;

import com.pccw.immd.adminfunc.annotation.AccessAudit;
import com.pccw.immd.adminfunc.dto.LoginUser;

public interface AccessAuditService {

    void log(String userId, LoginUser loginUser, String funcId, AccessAudit.AccessActionType actionType);
}