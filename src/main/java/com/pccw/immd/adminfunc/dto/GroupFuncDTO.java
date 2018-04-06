package com.pccw.immd.adminfunc.dto;

import com.pccw.immd.adminfunc.domain.Func;
import com.pccw.immd.adminfunc.domain.Group;
import com.pccw.immd.commons.dto.BaseDTO;

import java.util.ArrayList;
import java.util.List;

public class GroupFuncDTO extends BaseDTO {

    private List<Group> grpIdList = new ArrayList<>();
    private List<Func> funcIdList = new ArrayList<>();

    public List<Group> getGrpIdList() {
        return grpIdList;
    }

    public void setGrpIdList(List<Group> grpIdList) {
        this.grpIdList = grpIdList;
    }

    public List<Func> getFuncIdList() {
        return funcIdList;
    }

    public void setFuncIdList(List<Func> funcIdList) {
        this.funcIdList = funcIdList;
    }
}
