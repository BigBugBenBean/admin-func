package com.pccw.immd.adminfunc.dto;

import com.pccw.immd.adminfunc.domain.AuditLog;
import com.pccw.immd.commons.dto.BaseDTO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AuditLogDTO extends BaseDTO {

    private String funcId;

    private String userId;

    private Date startDate;

    private Date endDate;

    private List<AuditLog> auditLogList = new ArrayList<>();

    public List<AuditLog> getAuditLogList() {
        return auditLogList;
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setAuditLogList(List<AuditLog> auditLogList) {
        this.auditLogList = auditLogList;
    }


}
