package com.pccw.immd.adminfunc.repository;

import com.pccw.immd.adminfunc.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Integer>{

    List<Role> findAll();
}
