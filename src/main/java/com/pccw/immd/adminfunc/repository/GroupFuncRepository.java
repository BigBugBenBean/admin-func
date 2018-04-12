package com.pccw.immd.adminfunc.repository;

import com.pccw.immd.adminfunc.domain.GroupFunc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("groupFuncRepository")
public interface GroupFuncRepository extends JpaRepository<GroupFunc, Integer> {

    List<GroupFunc> findAll();

    @Query(value = "Select gf from GroupFunc gf where gf.grpId =:groupId")
    List<GroupFunc> findAllByGroupId(@Param("groupId") String groupId);
}
