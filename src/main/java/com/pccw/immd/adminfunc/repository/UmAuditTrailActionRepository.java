package com.pccw.immd.adminfunc.repository;

import com.pccw.immd.adminfunc.domain.AuditTrailAction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Dell on 13/2/2018.
 */
@Repository ("umAuditTrailActionRepository.eservice2")
public interface UmAuditTrailActionRepository extends JpaRepository<AuditTrailAction,Integer>{

}
