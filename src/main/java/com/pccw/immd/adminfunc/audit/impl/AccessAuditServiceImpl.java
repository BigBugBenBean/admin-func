package com.pccw.immd.adminfunc.audit.impl;

import com.pccw.immd.adminfunc.audit.AccessAuditService;
import com.pccw.immd.adminfunc.domain.ActionAuditTrail;
import com.pccw.immd.adminfunc.dto.LoginUser;
import com.pccw.immd.adminfunc.repository.UmActionAuditTrailRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Date;

import static com.pccw.immd.adminfunc.annotation.AccessAudit.AccessActionType;

@Service("accessAuditService")
public class AccessAuditServiceImpl implements AccessAuditService {

    private static final Logger LOG = LoggerFactory.getLogger(AccessAuditServiceImpl.class);

    @Autowired
    @Qualifier ("umActionAuditTrailRepository.eservice2")
    public UmActionAuditTrailRepository actionAuditTrailRepository;

    @Override
    public void log(String reqSessionId, LoginUser loginUser, String funcId, AccessActionType actionType){
        ActionAuditTrail at = formAuditTrail(reqSessionId, loginUser, funcId, actionType);
        actionAuditTrailRepository.saveAndFlush(at);
    }

    private ActionAuditTrail formAuditTrail(String reqSessionId, LoginUser loginUser, String funcId, AccessActionType actionType) {
        ActionAuditTrail at = new ActionAuditTrail();
        at.setOfficeCode(loginUser.getOfficeCode());
        at.setImmdToken(loginUser.getImmdToken());
        at.setUserId(loginUser.getUsername());
        at.setJsessionId(reqSessionId);
        if (actionType == AccessActionType.FUNCTION)
            at.setFuncId(funcId);
        at.setType(actionType.toString());
        at.setLogDatetime(new Date());
        return at;
    }
}