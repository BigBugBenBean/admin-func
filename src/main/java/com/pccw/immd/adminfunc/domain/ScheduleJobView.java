package com.pccw.immd.adminfunc.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


public class ScheduleJobView {

    private JobDetail jobDetail;
    private ScheduleJobViewHistory scheduleJobViewHistory;
    private QrtzTriggers qrtzTriggers;
    private QrtzCronTriggers qrtzCronTriggers;


    public JobDetail getJobDetail() {
        return jobDetail;
    }

    public void setJobDetail(JobDetail jobDetail) {
        this.jobDetail = jobDetail;
    }

    public ScheduleJobViewHistory getScheduleJobViewHistory() {
        return scheduleJobViewHistory;
    }

    public void setScheduleJobViewHistory(ScheduleJobViewHistory scheduleJobViewHistory) {
        this.scheduleJobViewHistory = scheduleJobViewHistory;
    }

    public QrtzTriggers getQrtzTriggers() {
        return qrtzTriggers;
    }

    public void setQrtzTriggers(QrtzTriggers qrtzTriggers) {
        this.qrtzTriggers = qrtzTriggers;
    }

    public QrtzCronTriggers getQrtzCronTriggers() {
        return qrtzCronTriggers;
    }

    public void setQrtzCronTriggers(QrtzCronTriggers qrtzCronTriggers) {
        this.qrtzCronTriggers = qrtzCronTriggers;
    }



}
