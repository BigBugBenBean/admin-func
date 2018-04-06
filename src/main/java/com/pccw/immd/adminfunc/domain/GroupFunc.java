package com.pccw.immd.adminfunc.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * *
 * *  File Name   : GroupFunc.java
 * *  Create Date : 2 Feb 2018
 * *  Author      : Dell
 * *
 */

@Entity
@Table(name = "UM_GROUP_FUNC")
public class GroupFunc {

    @Id
    @Column(name = "GROUP_ID", length = 16)
    private String grpId;

    @Column(name = "FUNC_ID", length = 8)
    private String funcId;

    public String getFuncId() {
        return funcId;
    }

    public void setFuncId(String funcId) {
        this.funcId = funcId;
    }

    public String getGrpId() {
        return grpId;
    }

    public void setGrpId(String grpId) {
        this.grpId = grpId;
    }


}
