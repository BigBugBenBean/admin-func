package com.pccw.immd.adminfunc.dto;

import com.pccw.immd.adminfunc.domain.Role;
import com.pccw.immd.commons.dto.BaseDTO;

import java.util.List;

public class RoleDTO extends BaseDTO {

    List<Role> roleId;

    public List<Role> getRoleId() {
        return roleId;
    }

    public void setRoleId(List<Role> roleId) {
        this.roleId = roleId;
    }

}
