package com.pccw.immd.adminfunc.repository;

import com.pccw.immd.adminfunc.domain.GroupFunc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GroupFuncRepository extends JpaRepository<GroupFunc, Integer> {

    List<GroupFunc> findAll();

    @Query(value = "select distinct(funcId) from GroupFunc")
    List<String> findAllFuncId();

    @Query(value = "Select gf from GroupFunc gf where gf.funcId =:funcId")
    List<GroupFunc> findAllByFuncId(@Param("funcId") String funcId);

    @Query(value = "Select gf from GroupFunc gf where gf.grpId =:groupId")
    List<GroupFunc> findAllByGroupId(String groupId);
}
