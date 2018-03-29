package com.pccw.immd.adminfunc.repository;

import com.pccw.immd.adminfunc.domain.SystemParam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("ivrsRepository.eservice2")
public interface IvrsRepository extends JpaRepository<SystemParam,String> {
    List<SystemParam> findAll();
}
