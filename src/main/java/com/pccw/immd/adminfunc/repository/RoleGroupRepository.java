package com.pccw.immd.adminfunc.repository;

import com.pccw.immd.adminfunc.domain.Group;
import com.pccw.immd.adminfunc.domain.Role;
import com.pccw.immd.adminfunc.domain.RoleGroup;
import com.pccw.immd.adminfunc.domain.id.RoleGroupId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("roleGroupRepository")
public interface RoleGroupRepository extends JpaRepository<RoleGroup, RoleGroupId> {

    List<RoleGroup> findByIdRoleCdIn(List<String> roleCd);

    List<RoleGroup> findByIdGroupId(String groupId);

    List<RoleGroup> findByIdRoleCd(String roleCd);

    @Query("select rg from RoleGroup rg, GroupFunc gf where rg.id.groupId = gf.id.grpId and gf.id.grpId =:grpId")
    List<RoleGroup> findRoleIdByGroupId(@Param("grpId")String grpId);
}
