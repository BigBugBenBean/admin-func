package com.pccw.immd.adminfunc.repository;

/*
 *
 * Generated Apr 25, 2018 11:13:49 AM by Hibernate Tools 5.0.6.Final
 * FreeMarker 2.3.8
 */

import com.pccw.immd.adminfunc.domain.SctlSvcTicket;
import com.pccw.immd.adminfunc.domain.SctlSvcTicketId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

;

@Repository ("sctlSvcTicketRepository.eservice2")
public interface SctlSvcTicketRepository extends JpaRepository<SctlSvcTicket,SctlSvcTicketId>{
}
