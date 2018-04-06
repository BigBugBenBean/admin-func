package com.pccw.immd.adminfunc.dto;

import com.pccw.immd.adminfunc.domain.Group;
import com.pccw.immd.commons.dto.BaseDTO;

import java.util.List;

public class GroupDTO extends BaseDTO {

    List<Group> grpId;

    public List<Group> getGrpId() {
        return grpId;
    }

    public void setGrpId(List<Group> grpId) {
        this.grpId = grpId;
    }
}
