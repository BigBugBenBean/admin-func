package com.pccw.immd.adminfunc.repository;

import com.pccw.immd.adminfunc.domain.GroupFunc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GroupFuncRepository extends JpaRepository<GroupFunc, Integer> {

    List<GroupFunc> findAll();

    @Query(value = "select distinct(funcId) from GroupFunc", nativeQuery = true)
    List<String> findAllFuncId();

    @Query(value = "Select gf from GroupFunc gf where gf.funcId =:funcId",
            nativeQuery = true)
    List<GroupFunc> findAllByFuncId(@Param("funcId") String funcId);

}
