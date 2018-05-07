package com.pccw.immd.adminfunc.repository;

import com.pccw.immd.adminfunc.domain.RoleGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userMenuRepository")
public interface UserMenuRepository extends JpaRepository<RoleGroup, Long>{

    @Query(value = "select F.DEST_URL from UM_ROLE_GROUP UM " +
            "INNER JOIN UM_GROUP G ON UM.GROUP_ID = G.GROUP_ID " +
            "INNER JOIN UM_GROUP_FUNC GF ON UM.GROUP_ID = GF.GROUP_ID " +
            "INNER JOIN UM_FUNC F ON GF.FUNC_ID = F.FUNC_ID " +
            "WHERE F.ENABLE = 'Y' AND " +
            "UM.ROLE_CD = :roleCd " +
            "order by F.DISPLAY_POS", nativeQuery = true)
    List<String> findFunctionsForUserRole(@Param("roleCd")String roleCd);


}
