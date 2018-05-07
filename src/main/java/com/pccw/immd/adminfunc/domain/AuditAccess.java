package com.pccw.immd.adminfunc.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "UMAUDIT_ACCESS")
public class AuditAccess {
    @Id
    @Column(name = "ACCESS_ID")
    private Integer accessId;

    @Column(name = "SESSION_ID")
    private String sessionId;

    @Column(name = "ACTION_TYPE")
    private String actionType;

    @Column(name = "FUNCID")
    private String funcId;

    @Column(name = "USERID")
    private String userId;

    @Column(name = "LOG_DATETIME")
    private Date logDatetime;

    @Column(name = "OFFICE_CODE")
    private String officeCode;

    public Integer getAccessId() {
        return accessId;
    }

    public void setAccessId(Integer accessId) {
        this.accessId = accessId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getFuncId() {
        return funcId;
    }

    public void setFuncId(String funcId) {
        this.funcId = funcId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getLogDatetime() {
        return logDatetime;
    }

    public void setLogDatetime(Date logDatetime) {
        this.logDatetime = logDatetime;
    }

    public String getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(String officeCode) {
        this.officeCode = officeCode;
    }
}
