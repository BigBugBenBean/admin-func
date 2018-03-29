package com.pccw.immd.adminfunc.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SYSTEM_PARAM")
public class SystemParam {

    @Id
    @Column(name = "SYS_PARAM_KEY")
    private String sysParamKey;

    @Column(name = "SYS_PARAM_VALUE")
    private String sysParamValue;

    public String getSysParamKey() {
        return sysParamKey;
    }

    public void setSysParamKey(String sysParamKey) {
        this.sysParamKey = sysParamKey;
    }

    public String getSysParamValue() {
        return sysParamValue;
    }

    public void setSysParamValue(String sysParamValue) {
        this.sysParamValue = sysParamValue;
    }
}
