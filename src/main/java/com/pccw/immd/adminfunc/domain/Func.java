package com.pccw.immd.adminfunc.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/** 
 ** 
 **  File Name   : Function.java
 **  Create Date : 2 Feb 2018
 **  Author      : Dell
 **
 */
@Entity
@Table(name = "UM_FUNC")
public class Func {

    @Id
    @Column(name = "FUNC_ID", 
            length = 4)
    private String funcId;

    @Column(name = "FUNC_DESC", 
            length = 2000)
    private String funcDesc;

    @Column(name = "DISPLAY_POS", 
            length = 3)
    private String displayPos;

    @Column(name = "FUNC_TYPE")
    private Integer funcType;

    @Column(name = "ENABLE", 
            length = 1, 
            columnDefinition= "Function Status, 1 = Eanble, 0 = Disable")
    private String enable;

    @Column(name="DEST_URL", length = 256)
    private String destUrl;

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

    public Integer getFuncType() {
        return funcType;
    }

    public void setFuncType(Integer funcType) {
        this.funcType = funcType;
    }

    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }

    public String getDestUrl() {
        return destUrl;
    }

    public void setDestUrl(String destUrl) {
        this.destUrl = destUrl;
    }
}
