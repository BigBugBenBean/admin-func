package com.pccw.immd.adminfunc.repository;

import com.pccw.immd.adminfunc.domain.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Dell on 24/1/2018.
 */
@Repository ("umAppoinmentRepository.eservice2")
public interface UmAppointment extends JpaRepository<Shop,Integer>{

}
