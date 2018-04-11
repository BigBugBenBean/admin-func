package com.pccw.immd.adminfunc.repository;

import com.pccw.immd.adminfunc.domain.Func;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("funcRepository.eservice2")
public interface FuncRepository extends JpaRepository<Func, Integer>{

    List<Func> findAll();

    @Query(value = "select f from Func f where f.funcId = :funcId")
    Func findByFuncId(@Param("funcId")String funcId);
}
