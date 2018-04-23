package com.pccw.immd.adminfunc.repository;

import com.pccw.immd.adminfunc.domain.Func;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("funcRepository")
public interface FuncRepository extends JpaRepository<Func, Integer>{

    List<Func> findAll();

    @Query(value = "select f "+
                    "FROM RoleGroup AS rg, " +
                    "GroupFunc AS gf, " +
                    "Func AS f "+
            "WHERE " +
            "  rg.id.groupId = gf.grpId AND gf.funcId = f.funcId AND " +
            "  rg.id.roleCd = :roleCd")
    List<Func> findByFuncId(@Param("roleCd")String roleCd);

    @Query(value = "select f from Func f where f.funcId = :funcId")
    List<Func> findFunctionsByUserRoles(@Param("funcId")String funcId);

    @Query(value = "select f from Func f where f.destUrl = :destUrl")
    Func getByDestUrl(@Param("destUrl")String destUrl);
}
