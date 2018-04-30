package com.pccw.immd.adminfunc.repository;

import com.pccw.immd.adminfunc.domain.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("groupRepository")
public interface GroupRepository extends JpaRepository<Group, Integer>{

    List<Group> findByGroupIdIn(List<String> groupId);
    Group findByGroupId(String groupId);
}
