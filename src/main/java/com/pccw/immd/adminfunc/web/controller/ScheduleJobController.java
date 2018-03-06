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
    public String scheduleJobViewPage() {
        return "/eServices2/ScheduleJob/schedule-job-view-search";
    }


    /**
     * Schedule Job View History
     * /e-Services-2/enquiry
     */

    @GetMapping(value = "/e-Services-2/enquiry/scheduleJobViewHistory.do")
    public String scheduleJobViewHistPage() {
        return "/eServices2/ScheduleJob/schedule-job-view-history-search";
    }


    /**
     * Schedule Job
     * /e-Services-2/maintenance/
     */

    @GetMapping(value = "/e-Services-2/maintenance/scheduleJob.do")
    public String scheduleJobPage() {
        return "/eServices2/ScheduleJob/schedule-job-search";
    }

}
