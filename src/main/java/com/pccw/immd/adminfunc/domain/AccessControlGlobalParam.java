package com.pccw.immd.adminfunc.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UM_ACCESS_CONTROL_GLOBAL_PARAM")
public class AccessControlGlobalParam {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "AC_PARAM_KEY", length = 20, updatable = false, nullable = false)
    private String key;

    @Column(name = "AC_PARAM_VALUE")
    private String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
