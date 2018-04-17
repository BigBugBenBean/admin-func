package com.pccw.immd.adminfunc.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UM_ROLE_GROUP")
public class RoleGroup {


    @Column(name ="ROLE_ID", length = 4)
    private String roleId;

    @Id
    @Column(name = "GROUP_ID", length = 16)
    private String groupId;

    @Column(name ="ROLE_CD", length = 30)
    private String roleCd;

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
}
