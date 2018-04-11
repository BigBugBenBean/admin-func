package com.pccw.immd.adminfunc.repository;

import com.pccw.immd.adminfunc.domain.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("groupRepository.eservice2")
public interface GroupRepository extends JpaRepository<Group, Integer>{

    List<Group> findAll();

    @Query(value = "select rg from RoleGroup rg where rg.groupId = :groupId")
    Group findByGroupId(@Param("groupId") String groupId);
}
