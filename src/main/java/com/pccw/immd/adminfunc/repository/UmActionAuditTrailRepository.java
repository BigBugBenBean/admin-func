package com.pccw.immd.adminfunc.repository;

import com.pccw.immd.adminfunc.domain.ActionAuditTrail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Dell on 13/2/2018.
 */
@Repository ("umActionAuditTrailRepository.eservice2")
public interface UmActionAuditTrailRepository extends JpaRepository<ActionAuditTrail,Integer>{

}
