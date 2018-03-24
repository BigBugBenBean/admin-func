package com.pccw.immd.adminfunc.dto;

import com.pccw.immd.adminfunc.domain.AuditLogResult;
import com.pccw.immd.commons.dto.BaseDTO;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AuditLogDTO extends BaseDTO {

    private String funcId;

    private String userId;

    @DateTimeFormat(pattern = "dd/MM/yyyy hh:mm")
    private Date startDate;

    @DateTimeFormat(pattern = "dd/MM/yyyy hh:mm")
    private Date endDate;

    private String startTime;
    private Integer startHour;
    private Integer startMinute;

    private String endTime;
    private Integer endHour;
    private Integer endMinute;

    private List<AuditLogResult> auditLogResultList = new ArrayList<>();


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

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public Integer getStartHour() {
        return startHour;
    }

    public void setStartHour(Integer startHour) {
        this.startHour = startHour;
    }

    public Integer getStartMinute() {
        return startMinute;
    }

    public void setStartMinute(Integer startMinute) {
        this.startMinute = startMinute;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getEndHour() {
        return endHour;
    }

    public void setEndHour(Integer endHour) {
        this.endHour = endHour;
    }

    public Integer getEndMinute() {
        return endMinute;
    }

    public void setEndMinute(Integer endMinute) {
        this.endMinute = endMinute;
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

    public List<AuditLogResult> getAuditLogResultList() {
        return auditLogResultList;
    }

    public void setAuditLogResultList(List<AuditLogResult> auditLogResultList) {
        this.auditLogResultList = auditLogResultList;
    }
}
