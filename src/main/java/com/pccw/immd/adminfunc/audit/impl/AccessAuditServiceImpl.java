package com.pccw.immd.adminfunc.audit.impl;

import static  com.pccw.immd.adminfunc.annotation.AccessAudit.AccessActionType;

import com.pccw.immd.adminfunc.audit.AccessAuditService;
import com.pccw.immd.adminfunc.domain.ActionAuditTrail;
import com.pccw.immd.adminfunc.dto.LoginUser;
import com.pccw.immd.adminfunc.repository.UmActionAuditTrailRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service("accessAuditService")
public class AccessAuditServiceImpl implements AccessAuditService {

    @Autowired
    @Qualifier ("umActionAuditTrailRepository.eservice2")
    public UmActionAuditTrailRepository actionAuditTrailRepository;

    @Override
    @Transactional
    public void log(String resessionId, LoginUser loginUser, String funcId, AccessActionType actionType){
        ActionAuditTrail at = formAuditTrail(resessionId, loginUser, funcId, actionType);
        actionAuditTrailRepository.saveAndFlush(at);
    }

    private ActionAuditTrail formAuditTrail(String resessionId, LoginUser loginUser, String funcId, AccessActionType actionType) {
        ActionAuditTrail at = new ActionAuditTrail();
        at.setOfficeCode(loginUser.getOfficeCode());
        at.setImmdToken(loginUser.getImmdToken());
        at.setUserId(loginUser.getUsername());
        at.setJsessionId(resessionId);
        at.setFuncId(funcId);
        at.setType(actionType.toString());
        at.setLogDatetime(new Date());
        return at;
    }
}