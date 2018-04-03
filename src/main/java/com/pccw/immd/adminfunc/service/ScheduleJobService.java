package com.pccw.immd.adminfunc.service;

import com.pccw.immd.adminfunc.domain.JobDetail;
import com.pccw.immd.adminfunc.domain.ScheduleJob;
import com.pccw.immd.adminfunc.domain.ScheduleJobView;
import com.pccw.immd.adminfunc.domain.ScheduleJobViewHistory;
import com.pccw.immd.adminfunc.dto.CreateScheduleJobDTO;
import com.pccw.immd.adminfunc.dto.ScheduleJobViewDTO;
import com.pccw.immd.adminfunc.dto.ScheduleJobViewHistoryDTO;

import java.util.List;

public interface ScheduleJobService {
    List<JobDetail> listAllJobDetail(String jobGroup);
    List<String> listAllJobNameByJobHistory();
    List<String> listAllJobNameByJobDetails();
    List<ScheduleJobViewHistory> listAllHistory(String jobName, String status);
    List<ScheduleJobViewHistory> searchScheduleJobHistoryList(ScheduleJobViewHistoryDTO scheduleJobViewHistoryDTO);

    List<ScheduleJobView> searchScheduleJobViewList(ScheduleJobViewDTO scheduleJobViewDTO);

    void createScheduleJob(CreateScheduleJobDTO createScheduleJobDTO);
    List<ScheduleJob> searchScheduleJobList(CreateScheduleJobDTO createScheduleJobDTO);
}
