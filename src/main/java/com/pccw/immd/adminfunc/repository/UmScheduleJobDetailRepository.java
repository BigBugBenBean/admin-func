package com.pccw.immd.adminfunc.repository;

import com.pccw.immd.adminfunc.domain.JobDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("umScheduleJobDetailRepository")
public interface UmScheduleJobDetailRepository extends JpaRepository<JobDetail, Integer> {
    List<JobDetail> findAllByJobGroup(String jobGroup);
}
