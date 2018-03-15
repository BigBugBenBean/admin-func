package com.pccw.immd.adminfunc.web.controller;

import com.pccw.immd.adminfunc.domain.JobDetail;
import com.pccw.immd.adminfunc.domain.ScheduleJobViewHistory;
import com.pccw.immd.adminfunc.dto.ScheduleJobDetailDTO;
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
    public String scheduleJobViewSearchPage() {
        return "/eServices2/ScheduleJob/schedule-job-view-search";
    }

    @GetMapping(value = "/e-Services-2/enquiry/scheduleJobView_Result.do")
    public String scheduleJobViewResultPage() {
        return "/eServices2/ScheduleJob/schedule-job-view-result";
    }


    /**
     * Schedule Job View History
     * /e-Services-2/enquiry
     */

    @GetMapping(value = "/e-Services-2/enquiry/scheduleJobViewHistory.do")
    public String scheduleJobViewHistSearchPage(@ModelAttribute ScheduleJobDetailDTO scheduleJobDetailDTO) {

        List<JobDetail> jobDetailList = scheduleJobService.listAllJobDetail("DEFAULT");
        LOG.debug("scheduleJobViewHistSearchPage jobDetailList size: " + jobDetailList.size());

        if (jobDetailList.size() > 0) {
            scheduleJobDetailDTO.setJobDetailList(jobDetailList);
        }

        List<ScheduleJobDetailDTO.JobStatus> statusList = scheduleJobDetailDTO.getStatusList();
        LOG.debug("scheduleJobViewHistSearchPage statusList size: " + statusList.size());

        return "/eServices2/ScheduleJob/schedule-job-view-history-search";
    }

    @PostMapping(value = "/e-Services-2/enquiry/scheduleJobViewHistory_Search.do")
    public String searchScheduleJobViewHistory(@ModelAttribute ScheduleJobViewHistoryDTO scheduleJobViewHistoryDTO) {

        scheduleJobViewHistoryDTO.setStatus(scheduleJobViewHistoryDTO.getStatus().toUpperCase());

        if (!scheduleJobViewHistoryDTO.getStartTime().equals("")
                && scheduleJobViewHistoryDTO.getStartHour() != null
                && scheduleJobViewHistoryDTO.getStartMinute() != null
                && !scheduleJobViewHistoryDTO.getEndTime().equals("")
                && scheduleJobViewHistoryDTO.getEndHour() != null
                && scheduleJobViewHistoryDTO.getEndMinute() != null
                ) {

            //
            String tmpStartHour = String.format("%02d", scheduleJobViewHistoryDTO.getStartHour());
            String tmpStartMinute = String.format("%02d", scheduleJobViewHistoryDTO.getStartMinute());
            String tmpEndHour = String.format("%02d", scheduleJobViewHistoryDTO.getEndHour());
            String tmpEndMinute = String.format("%02d", scheduleJobViewHistoryDTO.getEndMinute());

            //
            String dateRegex = "\\d{2}/\\d{2}/\\d{4}\\d{2}\\d{2}";
            String startDateStr = scheduleJobViewHistoryDTO.getStartTime() + tmpStartHour + tmpStartMinute;
            String endDateStr = scheduleJobViewHistoryDTO.getEndTime() + tmpEndHour + tmpEndMinute;

            // date search: optional
            if (!startDateStr.equals("") && !endDateStr.equals("")) {
                if (scheduleJobViewHistoryDTO.getStartHour() < 0 || scheduleJobViewHistoryDTO.getStartHour() >= 24) {
                    // TODO: exception case
                    LOG.debug("InvalidStartHour");
                }
                if (scheduleJobViewHistoryDTO.getStartMinute() < 0 || scheduleJobViewHistoryDTO.getStartMinute() >= 60) {
                    // TODO: exception case
                    LOG.debug("InvalidStartMinute");
                }
                if (scheduleJobViewHistoryDTO.getEndHour() < 0 || scheduleJobViewHistoryDTO.getEndHour() >= 24) {
                    // TODO: exception case
                    LOG.debug("InvalidEndHour");
                }
                if (scheduleJobViewHistoryDTO.getEndMinute() < 0 || scheduleJobViewHistoryDTO.getEndMinute() >= 60) {
                    // TODO: exception case
                    LOG.debug("InvalidEndMinute");
                }

                Boolean isValidStartDate = startDateStr.matches(dateRegex);
                Boolean isValidEndDate = endDateStr.matches(dateRegex);

                if (!isValidStartDate) {
                    // TODO: exception case
                    LOG.debug("InvalidStartDate");
                }
                if (!isValidEndDate) {
                    // TODO: exception case
                    LOG.debug("InvalidEndDate");
                }

                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyyHHmm");
                try {
                    Date startDate = dateFormat.parse(startDateStr);
                    Date endDate = dateFormat.parse(endDateStr);

                    scheduleJobViewHistoryDTO.setStartDate(startDate);
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

    @GetMapping(value = "/e-Services-2/enquiry/scheduleJobViewHistory_Result.do")
    public String scheduleJobViewHistResultPage() {

        // dummy
        String jobname = "job1";
        String status = "FAILED";

        List<ScheduleJobViewHistory> list = scheduleJobService.listAllHistory(jobname, status);
        LOG.debug("scheduleJobViewHistResultPage jobHistory size: " + list.size());

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

    @GetMapping(value = "/e-Services-2/maintenance/scheduleJob_Result.do")
    public String scheduleJobResultPage() {
        return "/eServices2/ScheduleJob/schedule-job-result";
    }

    @GetMapping(value = "/e-Services-2/maintenance/scheduleJob_Create.do")
    public String scheduleJobCreatePage() {
        return "/eServices2/ScheduleJob/schedule-job-create";
    }

    @GetMapping(value = "/e-Services-2/maintenance/scheduleJob_Success.do")
    public String scheduleJobCreateSuccessPage() {
        return "/eServices2/ScheduleJob/schedule-job-create-success";
    }

}
