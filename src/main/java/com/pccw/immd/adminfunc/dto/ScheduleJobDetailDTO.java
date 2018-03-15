package com.pccw.immd.adminfunc.dto;

import com.pccw.immd.adminfunc.domain.JobDetail;
import com.pccw.immd.commons.dto.BaseDTO;

import java.util.ArrayList;
import java.util.List;

public class ScheduleJobDetailDTO extends BaseDTO {

    private List<JobDetail> jobDetailList = new ArrayList<>();
    private List<JobStatus> statusList = new ArrayList<>();

    public ScheduleJobDetailDTO() {
        super();


        statusList.add(new JobStatus(0, "Success"));
        statusList.add(new JobStatus(1, "Failed"));
        statusList.add(new JobStatus(2, "Running"));
    }

    public List<JobDetail> getJobDetailList() {
        return jobDetailList;
    }

    public void setJobDetailList(List<JobDetail> jobDetailList) {
        this.jobDetailList = jobDetailList;
    }

    public List<JobStatus> getStatusList() {
        return statusList;
    }

    public void setStatusList(List<JobStatus> statusList) {
        this.statusList = statusList;
    }


    //
    public class JobStatus {
        private Integer id;
        private String name;

        public JobStatus(Integer id, String name) {
            this.id = id;
            this.name = name;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


    //    @Valid
//    @JsonProperty("jobName")
//    private String jobName = null;
//
//    public String getJobName() {
//        return jobName;
//    }
//
//    public void setJobName(String jobName) {
//        this.jobName = jobName;
//    }
}
