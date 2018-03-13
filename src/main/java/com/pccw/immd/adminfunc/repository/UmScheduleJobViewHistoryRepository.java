package com.pccw.immd.adminfunc.repository;

import com.pccw.immd.adminfunc.domain.ScheduleJobViewHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("umScheduleJobViewHistoryRepository")
public interface UmScheduleJobViewHistoryRepository extends JpaRepository<ScheduleJobViewHistory, Integer> {
    List<ScheduleJobViewHistory> findAllByJobName(String jobName);
}
