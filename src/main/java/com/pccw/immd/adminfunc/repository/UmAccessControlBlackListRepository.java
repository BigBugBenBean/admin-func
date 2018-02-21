package com.pccw.immd.adminfunc.repository;

import com.pccw.immd.adminfunc.domain.AccessControlBlackList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Dell on 13/2/2018.
 */
@Repository ("umAccessControlBlackListRepository.eservice2")
public interface UmAccessControlBlackListRepository extends JpaRepository<AccessControlBlackList,Integer>{

}
