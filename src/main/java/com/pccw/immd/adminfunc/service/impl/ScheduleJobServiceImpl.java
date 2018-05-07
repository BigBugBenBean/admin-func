package com.pccw.immd.adminfunc.service.impl;

import com.pccw.immd.adminfunc.domain.QrtzCronTriggers;
import com.pccw.immd.adminfunc.domain.QrtzTriggers;
import com.pccw.immd.adminfunc.domain.ScheduleJob;
import com.pccw.immd.adminfunc.domain.ScheduleJobView;
import com.pccw.immd.adminfunc.domain.ScheduleJobViewHistory;
import com.pccw.immd.adminfunc.dto.CreateScheduleJobDTO;
import com.pccw.immd.adminfunc.dto.ScheduleJobViewDTO;
import com.pccw.immd.adminfunc.dto.ScheduleJobViewHistoryDTO;
import com.pccw.immd.adminfunc.repository.HibernateUtils;
import com.pccw.immd.adminfunc.repository.UmScheduleJobDetailRepository;
import com.pccw.immd.adminfunc.repository.UmScheduleJobViewHistoryRepository;
import com.pccw.immd.adminfunc.service.ScheduleJobService;
import com.pccw.immd.adminfunc.utils.JobUtils;
import com.pccw.immd.adminfunc.web.controller.ScheduleJobController;
import org.quartz.CronScheduleBuilder;
import org.quartz.CronTrigger;
import org.quartz.Job;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.ObjectAlreadyExistsException;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
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
    public List<com.pccw.immd.adminfunc.domain.JobDetail> listAllJobDetail(String jobGroup) {
        return scheduleJobDetailRepository.findAllByJobGroup(jobGroup);
    }

    @Override
    public List<ScheduleJobViewHistory> listAllHistory(String jobName, String status) {
        return umScheduleJobViewHistoryRepository.findAllByJobName(jobName);
    }

    @Override
    public Boolean createScheduleJob(CreateScheduleJobDTO createScheduleJobDTO) {

        Boolean isCreated = false;


        JobDetail jobDetail = null;
        CronScheduleBuilder scheduleBuilder = null;

        String jobName = createScheduleJobDTO.getJobName();
        String jobDesc = createScheduleJobDTO.getDescription();
        String jobClassName = createScheduleJobDTO.getJobClass();
        String cronExpression = createScheduleJobDTO.getCronExpression();
        String jobDataMap = createScheduleJobDTO.getDataMap();


        try {
            SchedulerFactory sf = new StdSchedulerFactory();
            Scheduler scheduler = sf.getScheduler();

            try{
                jobDetail = JobBuilder.newJob(
                    JobUtils.getClass(jobClassName).getClass()
                )
                .withIdentity(jobName)
                .withDescription(jobDesc)
                .usingJobData(JobUtils.getJobDataMap(jobDataMap))
                .build();

            }catch (ClassNotFoundException e) {

            }catch (IllegalArgumentException e) {

            }catch (Exception e) {

            }

            try{
                scheduleBuilder = CronScheduleBuilder
                        .cronSchedule(cronExpression)
                        .withMisfireHandlingInstructionDoNothing();
            }catch (Exception e) {

            }


            CronTrigger trigger = TriggerBuilder.newTrigger()
                    .withIdentity(jobName)
                    .withSchedule(scheduleBuilder)
                    .build();

            if (jobDetail != null && scheduleBuilder != null) {
                try {
                    scheduler.scheduleJob(jobDetail, trigger);
                    isCreated = true;
                } catch (ObjectAlreadyExistsException e) {

                } catch (Exception e) {

                }
            }

        } catch(SchedulerException e) {

        } catch(Exception e) {

        }




//        EntityManager em = HibernateUtils.getEm();
//
//        Session session = HibernateUtils.getSession();
//        session.beginTransaction();
//
//        // Job Detail
//        JobDetail newJobDetail = new JobDetail();
//        newJobDetail.setJobName(createScheduleJobDTO.getJobName());
//        newJobDetail.setJobClassName(createScheduleJobDTO.getJobClass());
//        newJobDetail.setDescription(createScheduleJobDTO.getDescription());
//
//        newJobDetail.setSchedName(createScheduleJobDTO.getSchedName());
//        newJobDetail.setJobGroup(createScheduleJobDTO.getJobGroup());
//        newJobDetail.setIsDurable(createScheduleJobDTO.getIsDurable());
//        newJobDetail.setIsNonconcurrent(createScheduleJobDTO.getIsNonconcurrent());
//        newJobDetail.setIsUpdateData(createScheduleJobDTO.getIsUpdateData());
//        newJobDetail.setRequestsRecovery(createScheduleJobDTO.getRequestsRecovery());
//
//        // Qrtz Cron Triggers
//        QrtzCronTriggers newQrtzCronTriggers = new QrtzCronTriggers();
//        newQrtzCronTriggers.setSchedName(createScheduleJobDTO.getSchedName());
//        newQrtzCronTriggers.setTriggerName(createScheduleJobDTO.getJobName());
//        newQrtzCronTriggers.setTriggerGroup(createScheduleJobDTO.getJobGroup());
//        newQrtzCronTriggers.setCronExpression(createScheduleJobDTO.getCronExpression());
//
//
//        // save
//        session.save(newQrtzCronTriggers);
//        session.save(newJobDetail);
//
//        // commit
//        session.getTransaction().commit();
//        session.close();



        return isCreated;
    }

    @Override
    public List<String> listAllJobNameByJobHistory() {
        List<String> list;

        String hql = "select distinct jobName from ScheduleJobViewHistory ORDER BY jobName ASC";

        EntityManager em = HibernateUtils.getEm();
        Query query = em.createQuery(hql);
        list = query.getResultList();

        return list;
    }

    @Override
    public List<String> listAllJobNameByJobDetails() {
        List<String> list;

        String hql = "select distinct jobName from JobDetail ORDER BY jobName ASC";

        EntityManager em = HibernateUtils.getEm();
        Query query = em.createQuery(hql);
        list = query.getResultList();

        return list;
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

    @Override
    public List<ScheduleJobView> searchScheduleJobViewList(ScheduleJobViewDTO scheduleJobViewDTO) {
        String jobDetailName = "jd";
        String jobHistoryName = "jh";
        String triggersName = "t";
        String cronTriggersName = "ct";
        String hql = "from JobDetail as " + jobDetailName
                + " , ScheduleJobViewHistory as " + jobHistoryName
                + " , QrtzTriggers as " + triggersName
                + " , QrtzCronTriggers as " + cronTriggersName;

        Map<String, Object> params = new HashMap<>();

        hql += " WHERE "
                + "  " + jobDetailName + ".jobName = " + jobHistoryName + ".jobName  "
                + " AND " + jobDetailName + ".jobName = " + triggersName + ".jobName "
                + " AND " + jobDetailName + ".jobName = " + cronTriggersName + ".triggerName" ;

        //
        String whereClause = "";
        if (scheduleJobViewDTO.getJobName() != null) {
            whereClause += " and " + jobDetailName + ".jobName like '%" + scheduleJobViewDTO.getJobName() + "%' ";
        }
        if (scheduleJobViewDTO.getDataMap() != null && !scheduleJobViewDTO.getDataMap().equals("")) {
            whereClause += " and " + jobDetailName + ".dataMap like '%" + scheduleJobViewDTO.getDataMap() + "%' ";
        }
        if (scheduleJobViewDTO.getCronExpression() != null && !scheduleJobViewDTO.getCronExpression().equals("")) {
            whereClause += " and " + cronTriggersName + ".cronExpression like '" + scheduleJobViewDTO.getCronExpression() + "%' ";
        }
        if (scheduleJobViewDTO.getStatus() != null && !scheduleJobViewDTO.getStatus().equals("")) {
            whereClause += " and " + jobHistoryName + ".status like '%" + scheduleJobViewDTO.getStatus() + "%' ";
        }
        if (scheduleJobViewDTO.getStartDate() != null && scheduleJobViewDTO.getEndDate() != null) {

        }
        if (scheduleJobViewDTO.getStartDate() != null) {
            whereClause += " and " + triggersName + ".prevFireTime >= " + scheduleJobViewDTO.getStartDate().getTime();
        }
        if (scheduleJobViewDTO.getEndDate() != null) {
            whereClause += " and " + triggersName + ".nextFireTime <= " + scheduleJobViewDTO.getEndDate().getTime();
        }

        hql += whereClause;


        EntityManager em = HibernateUtils.getEm();
        Query query = em.createQuery(hql);
        List<?> list = query.getResultList();

        // combine object
        List<ScheduleJobView>viewList = new ArrayList<>();
        for (int i =0; i < list.size(); i++) {
            ScheduleJobView sjv = new ScheduleJobView();
            Object[] objects = (Object[]) list.get(i);
            for (Object obj: objects) {
                if (obj instanceof com.pccw.immd.adminfunc.domain.JobDetail) {
                    sjv.setJobDetail((com.pccw.immd.adminfunc.domain.JobDetail) obj);
                } else if (obj instanceof ScheduleJobViewHistory) {
                    sjv.setScheduleJobViewHistory((ScheduleJobViewHistory)obj);
                } else if (obj instanceof QrtzTriggers) {
                    sjv.setQrtzTriggers((QrtzTriggers)obj);
                } else if (obj instanceof QrtzCronTriggers) {
                    sjv.setQrtzCronTriggers((QrtzCronTriggers)obj);
                }
            }
            viewList.add(sjv);
        }

        return viewList;
    }

    @Override
    public List<ScheduleJob> searchScheduleJobList(CreateScheduleJobDTO createScheduleJobDTO) {
        String jobDetailName = "jd";
        String cronTriggersName = "ct";
        String hql = "from JobDetail as " + jobDetailName
                + " , QrtzCronTriggers as " + cronTriggersName;

        Map<String, Object> params = new HashMap<>();

        hql += " WHERE "
                + "  " + jobDetailName + ".jobName = " + cronTriggersName + ".triggerName" ;

        //
        String whereClause = "";
        if (createScheduleJobDTO.getJobName() != null) {
            whereClause += " and " + jobDetailName + ".jobName like '%" + createScheduleJobDTO.getJobName() + "%' ";
        }
        if (createScheduleJobDTO.getDataMap() != null && !createScheduleJobDTO.getDataMap().equals("")) {
            whereClause += " and " + jobDetailName + ".dataMap like '%" + createScheduleJobDTO.getDataMap() + "%' ";
        }
        if (createScheduleJobDTO.getCronExpression() != null && !createScheduleJobDTO.getCronExpression().equals("")) {
            whereClause += " and " + cronTriggersName + ".cronExpression like '" + createScheduleJobDTO.getCronExpression() + "%' ";
        }
        if (createScheduleJobDTO.getDescription() != null && !createScheduleJobDTO.getDescription().equals("")) {
            whereClause += " and " + jobDetailName + ".description like '%" + createScheduleJobDTO.getDescription() + "%' ";
        }

        hql += whereClause;


        EntityManager em = HibernateUtils.getEm();
        Query query = em.createQuery(hql);
        List<?> list = query.getResultList();

        // combine object
        List<ScheduleJob>viewList = new ArrayList<>();
        for (int i =0; i < list.size(); i++) {
            ScheduleJob sjv = new ScheduleJob();
            Object[] objects = (Object[]) list.get(i);
            for (Object obj: objects) {
                if (obj instanceof com.pccw.immd.adminfunc.domain.JobDetail) {
                    sjv.setJobDetail((com.pccw.immd.adminfunc.domain.JobDetail) obj);
                } else if (obj instanceof QrtzCronTriggers) {
                    sjv.setQrtzCronTriggers((QrtzCronTriggers)obj);
                }
            }
            viewList.add(sjv);
        }

        return viewList;
    }

    private String getWhereClause(String name, ScheduleJobViewHistoryDTO scheduleJobViewHistoryDTO, Map<String, Object> params) {
        String whereClause = "";
        String orderBy = " order by " + name + ".startTime DESC";

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
            } else if (scheduleJobViewHistoryDTO.getStartDate() != null) {
                whereClause += " and " + name + ".startTime >= :startDate ";
                params.put("startDate", scheduleJobViewHistoryDTO.getStartDate());
            } else if (scheduleJobViewHistoryDTO.getEndDate() != null) {
                whereClause += " and " + name + ".endTime <= :endDate";
                params.put("endDate", scheduleJobViewHistoryDTO.getEndDate());
            }
        }

        return whereClause.trim().length() == 0? "" : WHERE_CLAUSE + whereClause.substring(4) + orderBy;
    }
}
