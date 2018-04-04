package com.pccw.immd.adminfunc.web.controller;

import com.pccw.immd.adminfunc.domain.ScheduleJob;
import com.pccw.immd.adminfunc.domain.ScheduleJobView;
import com.pccw.immd.adminfunc.domain.ScheduleJobViewHistory;
import com.pccw.immd.adminfunc.dto.CreateScheduleJobDTO;
import com.pccw.immd.adminfunc.dto.JobStatus;
import com.pccw.immd.adminfunc.dto.ScheduleJobDetailDTO;
import com.pccw.immd.adminfunc.dto.ScheduleJobViewDTO;
import com.pccw.immd.adminfunc.dto.ScheduleJobViewHistoryDTO;
import com.pccw.immd.adminfunc.service.ScheduleJobService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class ScheduleJobController {
    private static final Logger LOG = LoggerFactory.getLogger(ScheduleJobController.class);

    @Autowired
    @Qualifier("scheduleJobService")
    private ScheduleJobService scheduleJobService;

    /**
     * Schedule Job View
     * /e-Services-2/enquiry
     */

    @GetMapping(value = "/e-Services-2/enquiry/scheduleJobView.do")
    public String scheduleJobViewSearchPage(@ModelAttribute ScheduleJobViewDTO scheduleJobViewDTO) {

        List<JobStatus> statusList = scheduleJobViewDTO.getStatusList();
        LOG.debug("scheduleJobViewHistSearchPage statusList size: " + statusList.size());

//        List<JobDetail> jobDetailList = scheduleJobService.listAllJobDetail("DEFAULT");
//        LOG.debug("scheduleJobViewHistSearchPage jobDetailList size: " + jobDetailList.size());

        List<String> jobNameList = scheduleJobService.listAllJobNameByJobDetails();

        if (jobNameList.size() > 0) {
            scheduleJobViewDTO.setJobNameList(jobNameList);
        }

        return "/eServices2/ScheduleJob/schedule-job-view-search";
    }

//    @GetMapping(value = "/e-Services-2/enquiry/scheduleJobView_Result.do")
//    public String scheduleJobViewResultPage() {
//        return "/eServices2/ScheduleJob/schedule-job-view-result";
//    }

    @PostMapping(value = "/e-Services-2/enquiry/scheduleJobView_Search.do")
    public String scheduleJobViewResultPage(@ModelAttribute ScheduleJobViewDTO scheduleJobViewDTO) {

        if (scheduleJobViewDTO.getStatus() != null && !scheduleJobViewDTO.equals("")) {
            scheduleJobViewDTO.setStatus(scheduleJobViewDTO.getStatus().toUpperCase());
        }


        // dummy data
//        String jobName = "tempJob";
//        String cron = "0 0/1 * * * ?";
//        String dataMap = "";
//        String status = "FAILED";
//
//        String startTime = "13/03/2018";
//        Integer startHour = 17;
//        Integer startMinute = 40;
//        String endTime = "13/03/2018";
//        Integer endHour = 17;
//        Integer endMinute = 45;
//
//        scheduleJobViewDTO.setJobName(jobName);
//        scheduleJobViewDTO.setCronExpression(cron);
//        scheduleJobViewDTO.setDataMap(dataMap);
//        scheduleJobViewDTO.setStatus(status);
//        scheduleJobViewDTO.setStartTime(startTime);
//        scheduleJobViewDTO.setStartHour(startHour);
//        scheduleJobViewDTO.setStartMinute(startMinute);
//        scheduleJobViewDTO.setEndTime(endTime);
//        scheduleJobViewDTO.setEndHour(endHour);
//        scheduleJobViewDTO.setEndMinute(endMinute);

        //
        String dateRegex = "\\d{2}/\\d{2}/\\d{4}\\d{2}\\d{2}";
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyyHHmm");

        // startDate
        if (!scheduleJobViewDTO.getStartTime().equals("")
                && scheduleJobViewDTO.getStartHour() != null
                && scheduleJobViewDTO.getStartMinute() != null
                ) {
            //
            String tmpStartHour = String.format("%02d", scheduleJobViewDTO.getStartHour());
            String tmpStartMinute = String.format("%02d", scheduleJobViewDTO.getStartMinute());

            //
            String startDateStr = scheduleJobViewDTO.getStartTime() + tmpStartHour + tmpStartMinute;

            if (!startDateStr.equals("")) {
                if (scheduleJobViewDTO.getStartHour() < 0 || scheduleJobViewDTO.getStartHour() >= 24) {
                    // TODO: exception case
                    LOG.debug("InvalidStartHour");
                }
                if (scheduleJobViewDTO.getStartMinute() < 0 || scheduleJobViewDTO.getStartMinute() >= 60) {
                    // TODO: exception case
                    LOG.debug("InvalidStartMinute");
                }

                Boolean isValidStartDate = startDateStr.matches(dateRegex);
                if (!isValidStartDate) {
                    // TODO: exception case
                    LOG.debug("InvalidStartDate");
                }

                try {
                    Date startDate = dateFormat.parse(startDateStr);
                    Long startLong = startDate.getTime();
                    scheduleJobViewDTO.setStartDate(startDate);
                } catch (ParseException e) {
                    // TODO: exception case
                    LOG.debug("ERROR: Date parse error");
                }
            }
        }

        // endDate
        if (!scheduleJobViewDTO.getEndTime().equals("")
                && scheduleJobViewDTO.getEndHour() != null
                && scheduleJobViewDTO.getEndMinute() != null
                ) {
            //
            String tmpEndHour = String.format("%02d", scheduleJobViewDTO.getEndHour());
            String tmpEndMinute = String.format("%02d", scheduleJobViewDTO.getEndMinute());

            //
            String endDateStr = scheduleJobViewDTO.getEndTime() + tmpEndHour + tmpEndMinute;

            if (!endDateStr.equals("")) {
                if (scheduleJobViewDTO.getEndHour() < 0 || scheduleJobViewDTO.getEndHour() >= 24) {
                    // TODO: exception case
                    LOG.debug("InvalidEndHour");
                }
                if (scheduleJobViewDTO.getEndMinute() < 0 || scheduleJobViewDTO.getEndMinute() >= 60) {
                    // TODO: exception case
                    LOG.debug("InvalidEndMinute");
                }

                Boolean isValidEndDate = endDateStr.matches(dateRegex);
                if (!isValidEndDate) {
                    // TODO: exception case
                    LOG.debug("InvalidEndDate");
                }

                try {
                    Date endDate = dateFormat.parse(endDateStr);
                    Long endLong = endDate.getTime();
                    scheduleJobViewDTO.setEndDate(endDate);
                } catch (ParseException e) {
                    // TODO: exception case
                    LOG.debug("ERROR: Date parse error");
                }
            }

        }

        List<ScheduleJobView>list = scheduleJobService.searchScheduleJobViewList(scheduleJobViewDTO);
        LOG.debug("list: " + list.size());

        if (list.size() > 0) {
            scheduleJobViewDTO.setScheduleJobViewList(list);
        }

        return "/eServices2/ScheduleJob/schedule-job-view-result";
    }


    /**
     * Schedule Job View History
     * /e-Services-2/enquiry
     */

    @GetMapping(value = "/e-Services-2/enquiry/scheduleJobViewHistory.do")
    public String scheduleJobViewHistSearchPage(@ModelAttribute ScheduleJobDetailDTO scheduleJobDetailDTO) {

        List<String> scheduleJobViewHistoryList = scheduleJobService.listAllJobNameByJobHistory();
        LOG.debug("scheduleJobViewHistSearchPage scheduleJobViewHistoryList size: " + scheduleJobViewHistoryList.size());

        if (scheduleJobViewHistoryList.size() > 0) {
            scheduleJobDetailDTO.setJobNameList(scheduleJobViewHistoryList);
        }

        List<JobStatus> statusList = scheduleJobDetailDTO.getStatusList();
        LOG.debug("scheduleJobViewHistSearchPage statusList size: " + statusList.size());

        return "/eServices2/ScheduleJob/schedule-job-view-history-search";
    }

    @PostMapping(value = "/e-Services-2/enquiry/scheduleJobViewHistory_Search.do")
    public String searchScheduleJobViewHistory(@ModelAttribute ScheduleJobViewHistoryDTO scheduleJobViewHistoryDTO) {

        if (scheduleJobViewHistoryDTO.getStatus() != null && !scheduleJobViewHistoryDTO.equals("")) {
            scheduleJobViewHistoryDTO.setStatus(scheduleJobViewHistoryDTO.getStatus().toUpperCase());
        }

        String dateRegex = "\\d{2}/\\d{2}/\\d{4}\\d{2}\\d{2}";

        // startDate
        if (!scheduleJobViewHistoryDTO.getStartTime().equals("")
                && scheduleJobViewHistoryDTO.getStartHour() != null
                && scheduleJobViewHistoryDTO.getStartMinute() != null) {

            //
            String tmpStartHour = String.format("%02d", scheduleJobViewHistoryDTO.getStartHour());
            String tmpStartMinute = String.format("%02d", scheduleJobViewHistoryDTO.getStartMinute());

            //
            String startDateStr = scheduleJobViewHistoryDTO.getStartTime() + tmpStartHour + tmpStartMinute;

            if (!startDateStr.equals("")) {
                if (scheduleJobViewHistoryDTO.getStartHour() < 0 || scheduleJobViewHistoryDTO.getStartHour() >= 24) {
                    // TODO: exception case
                    LOG.debug("InvalidStartHour");
                }
                if (scheduleJobViewHistoryDTO.getStartMinute() < 0 || scheduleJobViewHistoryDTO.getStartMinute() >= 60) {
                    // TODO: exception case
                    LOG.debug("InvalidStartMinute");
                }

                Boolean isValidStartDate = startDateStr.matches(dateRegex);
                if (!isValidStartDate) {
                    // TODO: exception case
                    LOG.debug("InvalidStartDate");
                }
                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyyHHmm");
                try {
                    Date startDate = dateFormat.parse(startDateStr);
                    scheduleJobViewHistoryDTO.setStartDate(startDate);
                } catch (ParseException e) {
                    // TODO: exception case
                    LOG.debug("ERROR: Date parse error");
                }
            }
        }

        // endDate
        if (!scheduleJobViewHistoryDTO.getEndTime().equals("")
                && scheduleJobViewHistoryDTO.getEndHour() != null
                && scheduleJobViewHistoryDTO.getEndMinute() != null) {

            //
            String tmpEndHour = String.format("%02d", scheduleJobViewHistoryDTO.getEndHour());
            String tmpEndMinute = String.format("%02d", scheduleJobViewHistoryDTO.getEndMinute());

            //
            String endDateStr = scheduleJobViewHistoryDTO.getEndTime() + tmpEndHour + tmpEndMinute;

            if (!endDateStr.equals("")) {
                if (scheduleJobViewHistoryDTO.getEndHour() < 0 || scheduleJobViewHistoryDTO.getEndHour() >= 24) {
                    // TODO: exception case
                    LOG.debug("InvalidEndHour");
                }
                if (scheduleJobViewHistoryDTO.getEndMinute() < 0 || scheduleJobViewHistoryDTO.getEndMinute() >= 60) {
                    // TODO: exception case
                    LOG.debug("InvalidEndMinute");
                }

                Boolean isValidEndDate = endDateStr.matches(dateRegex);
                if (!isValidEndDate) {
                    // TODO: exception case
                    LOG.debug("InvalidEndDate");
                }

                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyyHHmm");
                try {
                    Date endDate = dateFormat.parse(endDateStr);
                    scheduleJobViewHistoryDTO.setEndDate(endDate);
                } catch (ParseException e) {
                    // TODO: exception case
                    LOG.debug("ERROR: Date parse error");
                }
            }
        }

        List<ScheduleJobViewHistory> results = scheduleJobService.searchScheduleJobHistoryList(scheduleJobViewHistoryDTO);

        if (results != null && results.size() > 0) {
            scheduleJobViewHistoryDTO.setScheduleJobViewHistoryList(results);
        }

        return "/eServices2/ScheduleJob/schedule-job-view-history-result";
    }

    /**
     * Schedule Job
     * /e-Services-2/maintenance/
     */

    @GetMapping(value = "/e-Services-2/maintenance/scheduleJob.do")
    public String scheduleJobSearchPage() {
        return "/eServices2/ScheduleJob/schedule-job-search";
    }

    @PostMapping(value = "/e-Services-2/maintenance/scheduleJob_Result.do")
    public String scheduleJobResultPage(@ModelAttribute CreateScheduleJobDTO createScheduleJobDTO) {

//        String jobName = "job";
//        String cron = "0 0/1 * * * ?";
//        String dataMap = "";
//        String desc = "testDesc";

        //
//        createScheduleJobDTO.setJobName(jobName);
//        createScheduleJobDTO.setCronExpression(cron);
//        createScheduleJobDTO.setDataMap(dataMap);
//        createScheduleJobDTO.setDescription(desc);




        List<ScheduleJob> list = scheduleJobService.searchScheduleJobList(createScheduleJobDTO);
        if (list.size() > 0) {
            createScheduleJobDTO.setScheduleJobList(list);
        }


        return "/eServices2/ScheduleJob/schedule-job-result";
    }

//    @GetMapping(value = "/e-Services-2/maintenance/scheduleJob_Result.do")
//    public String scheduleJobResultPage() {
//        return "/eServices2/ScheduleJob/schedule-job-result";
//    }

    @GetMapping(value = "/e-Services-2/maintenance/scheduleJob_Create.do")
    public String scheduleJobCreatePage() {
        return "/eServices2/ScheduleJob/schedule-job-create";
    }

    @PostMapping(value = "/e-Services-2/maintenance/scheduleJob_Success.do")
    public String scheduleJobCreateSuccessPage(@ModelAttribute CreateScheduleJobDTO createScheduleJobDTO) {

        String jobName = "NewJob01";
        String jobClass = "com.immd.eservice2.job.report.EC_ROP_201_02_01";
        String cron = "0 0/1 * * * ?";
        String dataMap = "";
        String desc = "testDesc";

        //
//        createScheduleJobDTO.setJobName(jobName);
//        createScheduleJobDTO.setJobClass(jobClass);
//        createScheduleJobDTO.setCronExpression(cron);
//        createScheduleJobDTO.setDataMap(dataMap);
//        createScheduleJobDTO.setDescription(desc);

        if (createScheduleJobDTO.getJobName() != null
                && createScheduleJobDTO.getJobClass() != null
                && createScheduleJobDTO.getCronExpression() != null
                && createScheduleJobDTO.getDataMap() != null
                && createScheduleJobDTO.getDescription() != null
                ) {

            //
            createScheduleJobDTO.setSchedName("QuartzScheduler");
            createScheduleJobDTO.setJobGroup("DEFAULT");
            createScheduleJobDTO.setIsDurable("0");
            createScheduleJobDTO.setIsNonconcurrent("0");
            createScheduleJobDTO.setIsUpdateData("0");
            createScheduleJobDTO.setRequestsRecovery("0");

            Boolean isCreated = scheduleJobService.createScheduleJob(createScheduleJobDTO);
            if (!isCreated) {
                // create failure
            }
        }




        return "/eServices2/ScheduleJob/schedule-job-create-success";
    }

//    @GetMapping(value = "/e-Services-2/maintenance/scheduleJob_Success.do")
//    public String scheduleJobCreateSuccessPage() {
//        return "/eServices2/ScheduleJob/schedule-job-create-success";
//    }

}
