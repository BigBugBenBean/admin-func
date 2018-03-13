package com.pccw.immd.adminfunc.service;

import com.pccw.immd.adminfunc.domain.JobDetail;
import com.pccw.immd.adminfunc.domain.ScheduleJobViewHistory;

import java.util.List;

public interface ScheduleJobService {
    List<JobDetail> listAllJobDetail(String jobGroup);
    List<ScheduleJobViewHistory> listAllHistory(String jobName, String status);
}
