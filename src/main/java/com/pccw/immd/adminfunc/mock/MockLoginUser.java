package com.pccw.immd.adminfunc.mock;

import com.pccw.immd.adminfunc.dto.LoginUser;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;
import java.util.List;

/**
 * Created by Dell on 15/4/2018.
 */
public class MockLoginUser extends LoginUser implements Mock {
    public MockLoginUser(String username, String password,  List<String> roleCDs, Collection<? extends GrantedAuthority> authorities) {
        super(username, username, password, true, true, true, true, authorities);
        super.roleCDs = roleCDs;
    }
}
