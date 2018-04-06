package com.pccw.immd.adminfunc.dto;

import com.pccw.immd.commons.dto.BaseDTO;

import java.util.List;

public class GroupFuncRoleDTO extends BaseDTO {

    private List<RoleDTO> roleList;
    private String sysId;
    private List<GroupDTO> groupList;
    private List<FuncDTO> funcList;

    public List<RoleDTO> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<RoleDTO> roleList) {
        this.roleList = roleList;
    }

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    public List<GroupDTO> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<GroupDTO> groupList) {
        this.groupList = groupList;
    }

    public List<FuncDTO> getFuncList() {
        return funcList;
    }

    public void setFuncList(List<FuncDTO> funcList) {
        this.funcList = funcList;
    }
}
