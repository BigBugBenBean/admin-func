package com.pccw.immd.adminfunc.dto;

import com.pccw.immd.commons.dto.BaseDTO;

import java.util.ArrayList;
import java.util.List;

public class RoleGroupDTO extends BaseDTO {

    List<RoleDTO> roleIdList = new ArrayList<>();
    List<GroupDTO> groupIdList = new ArrayList<>();
    List<String> groupDesc = new ArrayList<>();

    public List<RoleDTO> getRoleIdList() {
        return roleIdList;
    }

    public void setRoleIdList(List<RoleDTO> roleIdList) {
        this.roleIdList = roleIdList;
    }

    public List<GroupDTO> getGroupIdList() {
        return groupIdList;
    }

    public void setGroupIdList(List<GroupDTO> groupIdList) {
        this.groupIdList = groupIdList;
    }

    public List<String> getGroupDesc() {
        return groupDesc;
    }

    public void setGroupDesc(List<String> groupDesc) {
        this.groupDesc = groupDesc;
    }
}
