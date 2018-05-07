package com.pccw.immd.adminfunc.repository;

import com.pccw.immd.adminfunc.domain.ApplicationCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("umApplicationCodeRepository.eservice2")
public interface UmApplicationCodeRepository extends JpaRepository<ApplicationCode,Integer> {
}
