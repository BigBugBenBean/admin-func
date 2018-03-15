package com.pccw.immd.adminfunc.service.impl;

import com.pccw.immd.adminfunc.domain.JobDetail;
import com.pccw.immd.adminfunc.domain.ScheduleJobViewHistory;
import com.pccw.immd.adminfunc.dto.ScheduleJobViewHistoryDTO;
import com.pccw.immd.adminfunc.repository.HibernateUtils;
import com.pccw.immd.adminfunc.repository.UmScheduleJobDetailRepository;
import com.pccw.immd.adminfunc.repository.UmScheduleJobViewHistoryRepository;
import com.pccw.immd.adminfunc.service.ScheduleJobService;
import com.pccw.immd.adminfunc.web.controller.ScheduleJobController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("scheduleJobService")
public class ScheduleJobServiceImpl implements ScheduleJobService {
    private static final Logger LOG = LoggerFactory.getLogger(ScheduleJobController.class);

    private static final String WHERE_CLAUSE = " where ";

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

    @Override
    public List<ScheduleJobViewHistory> searchScheduleJobHistoryList(ScheduleJobViewHistoryDTO scheduleJobViewHistoryDTO) {
        String name = "jh";
        String hql = "from ScheduleJobViewHistory " + name;
        Map<String, Object> params = new HashMap<>();
        hql += getWhereClause(name, scheduleJobViewHistoryDTO, params);

        List<ScheduleJobViewHistory> list = HibernateUtils.listByHQL(hql, params);
        LOG.debug("searchScheduleJobHistoryList: " + list.size());
        return list;
    }


    private String getWhereClause(String name, ScheduleJobViewHistoryDTO scheduleJobViewHistoryDTO, Map<String, Object> params) {
        String whereClause = "";

        if (scheduleJobViewHistoryDTO.getJobName() != null || scheduleJobViewHistoryDTO.getStatus() != null
                || scheduleJobViewHistoryDTO.getStartDate() != null || scheduleJobViewHistoryDTO.getEndDate() != null) {
            if (scheduleJobViewHistoryDTO.getJobName() != null) {
                whereClause += " and " + name + ".jobName = :jobName";
                params.put("jobName", scheduleJobViewHistoryDTO.getJobName());
            }
            if (scheduleJobViewHistoryDTO.getStatus() != null && !scheduleJobViewHistoryDTO.getStatus().equals("")) {
                whereClause += " and " + name + ".status = :status";
                params.put("status", scheduleJobViewHistoryDTO.getStatus());
            }
            if (scheduleJobViewHistoryDTO.getStartDate() != null && scheduleJobViewHistoryDTO.getEndDate() != null) {
                whereClause += " and " + name + ".startTime BETWEEN :startDate AND :endDate";
                params.put("startDate", scheduleJobViewHistoryDTO.getStartDate());
                params.put("endDate", scheduleJobViewHistoryDTO.getEndDate());
            }
        }

        return whereClause.trim().length() == 0? "" : WHERE_CLAUSE + whereClause.substring(4);
    }
}
