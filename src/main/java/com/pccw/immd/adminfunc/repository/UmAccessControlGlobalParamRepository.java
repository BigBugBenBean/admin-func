package com.pccw.immd.adminfunc.repository;

import com.pccw.immd.adminfunc.domain.AccessControlGlobalParam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Dell on 13/2/2018.
 */
@Repository ("umAccessControlGlobalParamRepository.eservice2")
public interface UmAccessControlGlobalParamRepository extends JpaRepository<AccessControlGlobalParam,Integer>{

}
