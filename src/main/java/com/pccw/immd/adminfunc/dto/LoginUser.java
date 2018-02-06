package com.pccw.immd.adminfunc.dto;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

/**
 * Created by Dell on 31/1/2018.
 */

public class LoginUser extends User {

    private String displayName;

    public LoginUser(String username, String displayName, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
        this(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
        this.displayName = displayName;
    }

    public LoginUser(String username, String displayName, String password, Collection<? extends GrantedAuthority> authorities) {
        this(username, password, authorities);
        this.displayName = displayName;
    }

    public LoginUser(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
    }

    public LoginUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }

    public String getDisplayName() {
        return displayName;
    }

}
