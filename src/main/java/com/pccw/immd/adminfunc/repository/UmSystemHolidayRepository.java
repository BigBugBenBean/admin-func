package com.pccw.immd.adminfunc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pccw.immd.adminfunc.domain.SystemHoliday;

import java.util.List;

/**
 * Created by Dell on 24/1/2018.
 */
@Repository ("umSystemHolidayRepository.eservice2")
public interface UmSystemHolidayRepository extends JpaRepository<SystemHoliday,Integer>{

    List<SystemHoliday> findAllByOrderByHolidayDateDesc();
}
