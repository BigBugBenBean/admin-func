package com.pccw.immd.adminfunc.dto;

import com.pccw.immd.commons.dto.BaseDTO;

import java.util.List;

public class RoleGroupDTO extends BaseDTO {

    RoleDTO roleId;
    GroupDTO groupId;
    String groupDesc;

    public RoleDTO getRoleId() {
        return roleId;
    }

    public void setRoleId(RoleDTO roleId) {
        this.roleId = roleId;
    }

    public GroupDTO getGroupId() {
        return groupId;
    }

    public void setGroupId(GroupDTO groupId) {
        this.groupId = groupId;
    }

    public String getGroupDesc() {
        return groupDesc;
    }

    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
    }
}
