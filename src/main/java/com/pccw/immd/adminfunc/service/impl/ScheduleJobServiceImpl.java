package com.pccw.immd.adminfunc.service.impl;

import com.pccw.immd.adminfunc.domain.JobDetail;
import com.pccw.immd.adminfunc.domain.ScheduleJobViewHistory;
import com.pccw.immd.adminfunc.repository.UmScheduleJobDetailRepository;
import com.pccw.immd.adminfunc.repository.UmScheduleJobViewHistoryRepository;
import com.pccw.immd.adminfunc.service.ScheduleJobService;
import com.pccw.immd.adminfunc.web.controller.ScheduleJobController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("scheduleJobService")
public class ScheduleJobServiceImpl implements ScheduleJobService {
    private static final Logger LOG = LoggerFactory.getLogger(ScheduleJobController.class);

    @Autowired
    @Qualifier("umScheduleJobViewHistoryRepository")
    private UmScheduleJobViewHistoryRepository umScheduleJobViewHistoryRepository;

    @Autowired
    @Qualifier("umScheduleJobDetailRepository")
    private UmScheduleJobDetailRepository scheduleJobDetailRepository;

    @Override
    public List<JobDetail> listAllJobDetail(String jobGroup) {
        return scheduleJobDetailRepository.findAllByJobGroup(jobGroup);
    }

    @Override
    public List<ScheduleJobViewHistory> listAllHistory(String jobName, String status) {
        return umScheduleJobViewHistoryRepository.findAllByJobName(jobName);
    }
}
