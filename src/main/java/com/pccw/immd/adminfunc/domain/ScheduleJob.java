package com.pccw.immd.adminfunc.domain;

public class ScheduleJob {

    private JobDetail jobDetail;
    private QrtzCronTriggers qrtzCronTriggers;

    public JobDetail getJobDetail() {
        return jobDetail;
    }

    public void setJobDetail(JobDetail jobDetail) {
        this.jobDetail = jobDetail;
    }

    public QrtzCronTriggers getQrtzCronTriggers() {
        return qrtzCronTriggers;
    }

    public void setQrtzCronTriggers(QrtzCronTriggers qrtzCronTriggers) {
        this.qrtzCronTriggers = qrtzCronTriggers;
    }
}
