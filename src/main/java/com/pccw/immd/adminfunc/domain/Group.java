package com.pccw.immd.adminfunc.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/** 
 ** 
 **  File Name   : Group.java
 **  Create Date : 2 Feb 2018
 **  Author      : Dell
 **
 */
@Entity
@Table(name = "UM_GROUP")
public class Group {

    @Id
    @Column(name = "GROUP_ID", 
            length = 16)
    private String groupId;

    @Column(name = "GROUP_DESC", 
            length = 2000)
    private String groupDesc;
    
    @Column(name = "DISPLAY_POS", 
            length = 3)
    private String displayPos;

    @Column(name = "LST_UPD_ID", 
            length = 10)
    private String lstUpdId;
    
    @Column(name = "LST_UPD_DT")
    private Date lstUpdTd;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupDesc() {
        return groupDesc;
    }

    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
    }

    public String getDisplayPos() {
        return displayPos;
    }

    public void setDisplayPos(String displayPos) {
        this.displayPos = displayPos;
    }

    public String getLstUpdId() {
        return lstUpdId;
    }

    public void setLstUpdId(String lstUpdId) {
        this.lstUpdId = lstUpdId;
    }

    public Date getLstUpdTd() {
        return lstUpdTd;
    }

    public void setLstUpdTd(Date lstUpdTd) {
        this.lstUpdTd = lstUpdTd;
    }
    
    
}
