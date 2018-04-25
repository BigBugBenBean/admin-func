package com.pccw.immd.adminfunc.domain.id;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

/**
 * Created by Dell on 23/4/2018.
 */

@Embeddable
public class RoleGroupId implements Serializable {

    @Column(name ="ROLE_ID", length = 4)
    private String roleId;

    @Column(name = "GROUP_ID", length = 16)
    private String groupId;

    @Column(name ="ROLE_CD", length = 30)
    private String roleCd;

    public RoleGroupId(){}

    public RoleGroupId(String roleId, String groupId, String roleCd) {
        this.roleId = roleId;
        this.groupId = groupId;
        this.roleCd = roleCd;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getRoleCd() {
        return roleCd;
    }

    public void setRoleCd(String roleCd) {
        this.roleCd = roleCd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RoleGroupId)) return false;
        RoleGroupId that = (RoleGroupId) o;
        return Objects.equals(getRoleCd(), that.getRoleCd()) &&
                Objects.equals(getGroupId(), that.getGroupId()) &&
                Objects.equals(getRoleId(), that.getRoleId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRoleCd(), getGroupId(), getRoleId());
    }
}
