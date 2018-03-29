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
    private String funcId;

    @Column(name = "GROUP_DESC", 
            length = 2000)
    private String funcDesc;
    
    @Column(name = "DISPLAY_POS", 
            length = 3)
    private String displayPos;

    @Column(name = "LST_UPD_ID", 
            length = 10)
    private String lstUpdId;
    
    @Column(name = "LST_UPD_DT")
    private Date lstUpdTd;

    public String getFuncId() {
        return funcId;
    }

    public void setFuncId(String funcId) {
        this.funcId = funcId;
    }

    public String getFuncDesc() {
        return funcDesc;
    }

    public void setFuncDesc(String funcDesc) {
        this.funcDesc = funcDesc;
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
