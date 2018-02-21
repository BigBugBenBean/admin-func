package com.pccw.immd.adminfunc.repository;

import com.pccw.immd.adminfunc.domain.AccessControlWhiteList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Dell on 13/2/2018.
 */
@Repository ("umAccessControlWhiteListRepository.eservice2")
public interface UmAccessControlWhiteListRepository extends JpaRepository<AccessControlWhiteList,Integer>{

}
