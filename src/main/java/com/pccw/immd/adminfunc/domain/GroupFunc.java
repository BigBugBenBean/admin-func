package com.pccw.immd.adminfunc.domain;

import com.pccw.immd.adminfunc.domain.id.GroupFuncId;

import javax.persistence.*;

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

    @EmbeddedId
    GroupFuncId id;

    public GroupFuncId getId() {
        return id;
    }

    public void setId(GroupFuncId id) {
        this.id = id;
    }
}
