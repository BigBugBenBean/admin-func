package com.pccw.immd.adminfunc.dto;

import com.pccw.immd.adminfunc.domain.ScheduleJobView;
import com.pccw.immd.commons.dto.BaseDTO;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScheduleJobViewDTO extends BaseDTO {

    private String jobName;
    private String cronExpression;
    private String dataMap;
    private String status;

    private List<JobStatus> statusList = new ArrayList<>();
    private List<ScheduleJobView> scheduleJobViewList = new ArrayList<>();

    public ScheduleJobViewDTO() {
        super();

        statusList.add(new JobStatus(0, "SUCCESS"));
        statusList.add(new JobStatus(1, "FAILED"));
        statusList.add(new JobStatus(2, "RUNNING"));
    }

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


    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getCronExpression() {
        return cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
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

    public List<JobStatus> getStatusList() {
        return statusList;
    }

    public void setStatusList(List<JobStatus> statusList) {
        this.statusList = statusList;
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

    public String getDataMap() {
        return dataMap;
    }

    public void setDataMap(String dataMap) {
        this.dataMap = dataMap;
    }

    public List<ScheduleJobView> getScheduleJobViewList() {
        return scheduleJobViewList;
    }

    public void setScheduleJobViewList(List<ScheduleJobView> scheduleJobViewList) {
        this.scheduleJobViewList = scheduleJobViewList;
    }
}
