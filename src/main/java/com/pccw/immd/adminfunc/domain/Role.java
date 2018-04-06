package com.pccw.immd.adminfunc.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UM_ROLE")
public class Role {

    @Id
    @Column(name = "ROLE_ID", length = 4)
    private String roleId;

    @Column(name = "ROLE_DESC")
    private String roleDesc;

    @Column(name = "DELEGATE_PRI", length = 1)
    private String delegatePri;

    @Column(name = "DISPLAY_POS", length = 2)
    private String displayPos;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public String getDelegatePri() {
        return delegatePri;
    }

    public void setDelegatePri(String delegatePri) {
        this.delegatePri = delegatePri;
    }

    public String getDisplayPos() {
        return displayPos;
    }

    public void setDisplayPos(String displayPos) {
        this.displayPos = displayPos;
    }
}


//ROLE_ID" VARCHAR2(4 BYTE),
//        "ROLE_DESC" VARCHAR2(128 BYTE),
//        "DELEGATE_PRI" VARCHAR2(1 BYTE),
//        "DISPLAY_POS" VARCHAR2(2 BYTE)
