package com.pccw.immd.adminfunc.dto;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;

/**
 * Created by Dell on 31/1/2018.
 */

public class LoginUser extends User {

    private String sessionId;
    private String immdToken;
    private String officeCode;
    private String displayName;

    protected List<String> posts;
    protected List<String> roleCDs;
    protected List<String> systemIDs;
    protected String locID;
    protected Calendar passwordExpiryDateTime;

    public LoginUser(String username, UpmsUser upmsUser, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
        this(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
        this.immdToken = upmsUser.getIss3UserSignOnDTO().getImmdToken();

        this.displayName = upmsUser.getIss3UserSignOnDTO().getUserEngName();
        this.posts = upmsUser.getIss3UserSignOnDTO().getPosts();
        this.roleCDs = upmsUser.getIss3UserSignOnDTO().getRoleCDs();
        this.systemIDs = upmsUser.getIss3UserSignOnDTO().getSysIDs();

        this.locID = upmsUser.getIss3UserSignOnDTO().getLocID();
        this.passwordExpiryDateTime = upmsUser.getIss3UserSignOnDTO().getPasswordExpiryDateTime().toGregorianCalendar();
    }

    public LoginUser(String username, String displayName, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
        this(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
        this.displayName = displayName;

        this.roleCDs = new ArrayList<>();
        roleCDs.add("R01");
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

    public List<String> getPosts() {
        return posts;
    }

    public List<String> getRoleCDs() {
        return roleCDs;
    }

    public Calendar getPasswordExpiryDateTime() {
        return passwordExpiryDateTime;
    }

    public String getLocID() {
        return locID;
    }

    public List<String> getSystemIDs() {
        return systemIDs;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getImmdToken() {
        return immdToken;
    }

    public void setImmdToken(String immdToken) {
        this.immdToken = immdToken;
    }

    public String getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(String officeCode) {
        this.officeCode = officeCode;
    }
}
