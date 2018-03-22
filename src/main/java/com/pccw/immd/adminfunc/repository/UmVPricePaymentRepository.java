package com.pccw.immd.adminfunc.repository;

import com.pccw.immd.adminfunc.domain.VPricePayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("umVPricePaymentRepository.eservice2")
public interface UmVPricePaymentRepository extends JpaRepository<VPricePayment,Integer> {
    List<VPricePayment> findAll();
}
