package com.pccw.immd.adminfunc.dto;

import com.pccw.immd.adminfunc.domain.SctlSvcCfg;
import com.pccw.immd.adminfunc.domain.SctlTrend;

import java.io.Serializable;
import java.math.BigDecimal;

public class SurgeControlView implements Serializable {


    private SctlSvcCfg sctlSvcCfg;
    private SctlTrend sctlTrend;

    public SurgeControlView() {
    }

    public SctlSvcCfg getSctlSvcCfg() {
        return sctlSvcCfg;
    }

    public void setSctlSvcCfg(SctlSvcCfg sctlSvcCfg) {
        this.sctlSvcCfg = sctlSvcCfg;
    }

    public SctlTrend getSctlTrend() {
        return sctlTrend;
    }

    public void setSctlTrend(SctlTrend sctlTrend) {
        this.sctlTrend = sctlTrend;
    }

}
