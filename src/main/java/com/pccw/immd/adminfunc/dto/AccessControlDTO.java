package com.pccw.immd.adminfunc.dto;

import com.pccw.immd.adminfunc.domain.AccessControl;
import com.pccw.immd.commons.dto.BaseDTO;

import java.util.ArrayList;
import java.util.List;

public class AccessControlDTO extends BaseDTO {

    private List<AccessControl> accessControlList = new ArrayList<>();

    public List<AccessControl> getAccessControlList() {
        return accessControlList;
    }

    public void setAccessControlList(List<AccessControl> accessControlList) {
        this.accessControlList = accessControlList;
    }



}
