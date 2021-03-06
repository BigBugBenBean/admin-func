package com.pccw.immd.adminfunc.dto;

import com.pccw.immd.adminfunc.domain.ScheduleJobViewHistory;
import com.pccw.immd.commons.dto.BaseDTO;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScheduleJobViewHistoryDTO extends BaseDTO {

    private List<ScheduleJobViewHistory> scheduleJobViewHistoryList = new ArrayList<>();

    private String jobName;
    private String status;

    @DateTimeFormat(pattern = "dd/MM/yyyy hh:mm")
//    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date startDate;

    @DateTimeFormat(pattern = "dd/MM/yyyy hh:mm")
//    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date endDate;

    private String startTime;
    private Integer startHour;
    private Integer startMinute;

    private String endTime;
    private Integer endHour;
    private Integer endMinute;


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

    public List<ScheduleJobViewHistory> getScheduleJobViewHistoryList() {
        return scheduleJobViewHistoryList;
    }

    public void setScheduleJobViewHistoryList(List<ScheduleJobViewHistory> scheduleJobViewHistoryList) {
        this.scheduleJobViewHistoryList = scheduleJobViewHistoryList;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
}
