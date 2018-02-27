package com.pccw.immd.adminfunc.repository;

import com.pccw.immd.adminfunc.domain.AuditTrailSearch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Dell on 27/2/2018.
 */
@Repository ("umAuditTrailSearchRepository.eservice2")
public interface UmAuditTrailSearchRepository extends JpaRepository<AuditTrailSearch,Integer>{

}
