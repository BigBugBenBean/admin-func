package com.pccw.immd.adminfunc.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "JOB_HISTORY")
public class ScheduleJobViewHistory {
    @Id
    @Column(name = "JOB_HISTORY_ID")
    private Integer jobHistoryId;

    @Column(name = "JOB_NAME")
    private String jobName;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "START_TIME")
    private Date startTime;

    @Column(name = "END_TIME")
    private Date endTime;

    public Integer getJobHistoryId() {
        return jobHistoryId;
    }

    public void setJobHistoryId(Integer jobHistoryId) {
        this.jobHistoryId = jobHistoryId;
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

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
