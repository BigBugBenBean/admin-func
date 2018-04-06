package com.pccw.immd.adminfunc.repository;

import com.pccw.immd.adminfunc.domain.Group;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GroupRepository extends JpaRepository<Group, Integer>{

    List<Group> findAll();


}
