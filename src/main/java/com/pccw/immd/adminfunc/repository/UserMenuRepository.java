package com.pccw.immd.adminfunc.repository;

import com.pccw.immd.adminfunc.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userMenuRepository")
public interface UserMenuRepository extends JpaRepository<Post, Long>{

    @Query(value = "select P.POST_ID, P.ROLE_ID, P.OFFICE_CODE, F.FUNC_ID, F.FUNC_DESC, F.DISPLAY_POS, F.DEST_URL " +
            "from UM_POST P " +
            "inner join UM_ROLE R on P.ROLE_ID = R.ROLE_ID " +
            "inner join UM_ROLE_GROUP RG on RG.ROLE_ID = R.ROLE_ID " +
            "inner join UM_GROUP_FUNC GF on GF.GROUP_ID = RG.GROUP_ID " +
            "inner join UM_FUNC F on F.FUNC_ID = GF.FUNC_ID " +
            "WHERE P.ROLE_ID = :roleCd", nativeQuery = true)
    List<Object[]> findFunctionsForUserRole(@Param("roleCd")String roleCd);

}
