package com.pccw.immd.adminfunc.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ScheduleJobController {
    private static final Logger LOG = LoggerFactory.getLogger(AccessControlController.class);


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
    public String scheduleJobViewHistSearchPage() {
        return "/eServices2/ScheduleJob/schedule-job-view-history-search";
    }

    @GetMapping(value = "/e-Services-2/enquiry/scheduleJobViewHistory_Result.do")
    public String scheduleJobViewHistResultPage() {
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
