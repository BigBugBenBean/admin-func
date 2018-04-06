package com.pccw.immd.adminfunc.repository;

import com.pccw.immd.adminfunc.domain.Func;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FuncRepository extends JpaRepository<Func, Integer>{

    List<Func> findAll();
}
