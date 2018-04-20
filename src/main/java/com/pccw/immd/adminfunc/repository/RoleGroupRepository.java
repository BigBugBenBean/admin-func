package com.pccw.immd.adminfunc.repository;

import com.pccw.immd.adminfunc.domain.Group;
import com.pccw.immd.adminfunc.domain.Role;
import com.pccw.immd.adminfunc.domain.RoleGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("roleGroupRepository")
public interface RoleGroupRepository extends JpaRepository<RoleGroup, Integer> {

    @Query(value = "select rg from RoleGroup rg where rg.roleCd = :roleCd")
    List<RoleGroup> findAllbyRoleCd(@Param("roleCd") String roleCd);

    @Query(value = "select distinct(roleCd) from RoleGroup")
    List<String> findAllRoleCodes();
}
