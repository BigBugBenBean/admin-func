package com.pccw.immd.adminfunc.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "QRTZ_JOB_DETAILS")
public class JobDetail {

    @Column(name = "SCHED_NAME")
    private String schedName;

    @Id
    @Column(name = "JOB_NAME")
    private String jobName;

    @Column(name = "JOB_GROUP")
    private String jobGroup;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "JOB_CLASS_NAME")
    private String jobClassName;

    @Column(name = "IS_DURABLE")
    private String isDurable;

    @Column(name = "IS_NONCONCURRENT")
    private String isNonconcurrent;

    @Column(name = "IS_UPDATE_DATA")
    private String isUpdateData;

    @Column(name = "REQUESTS_RECOVERY")
    private String requestsRecovery;

    public String getSchedName() {
        return schedName;
    }

    public void setSchedName(String schedName) {
        this.schedName = schedName;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobGroup() {
        return jobGroup;
    }

    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getJobClassName() {
        return jobClassName;
    }

    public void setJobClassName(String jobClassName) {
        this.jobClassName = jobClassName;
    }

    public String getDurable() {
        return isDurable;
    }

    public void setDurable(String durable) {
        isDurable = durable;
    }

    public String getNonconcurrent() {
        return isNonconcurrent;
    }

    public void setNonconcurrent(String nonconcurrent) {
        isNonconcurrent = nonconcurrent;
    }

    public String getUpdateData() {
        return isUpdateData;
    }

    public void setUpdateData(String updateData) {
        isUpdateData = updateData;
    }

    public String getRequestsRecovery() {
        return requestsRecovery;
    }

    public void setRequestsRecovery(String requestsRecovery) {
        this.requestsRecovery = requestsRecovery;
    }
}
