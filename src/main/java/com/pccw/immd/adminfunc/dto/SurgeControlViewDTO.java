package com.pccw.immd.adminfunc.dto;

import com.pccw.immd.adminfunc.domain.SctlSvcCfg;
import com.pccw.immd.commons.dto.BaseDTO;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SurgeControlViewDTO extends BaseDTO {

    private String svcId;
    private BigDecimal gst;
    private String svcDesc;
    private BigDecimal mst;
    private BigDecimal priority;
    private String clawback;

    private List<SurgeControlView> surgeControlViewList = new ArrayList<>();

    public String getSvcId() {
        return svcId;
    }

    public void setSvcId(String svcId) {
        this.svcId = svcId;
    }

    public BigDecimal getGst() {
        return gst;
    }

    public void setGst(BigDecimal gst) {
        this.gst = gst;
    }

    public String getSvcDesc() {
        return svcDesc;
    }

    public void setSvcDesc(String svcDesc) {
        this.svcDesc = svcDesc;
    }

    public BigDecimal getMst() {
        return mst;
    }

    public void setMst(BigDecimal mst) {
        this.mst = mst;
    }

    public BigDecimal getPriority() {
        return priority;
    }

    public void setPriority(BigDecimal priority) {
        this.priority = priority;
    }

    public String getClawback() {
        return clawback;
    }

    public void setClawback(String clawback) {
        this.clawback = clawback;
    }

    public List<SurgeControlView> getSurgeControlViewList() {
        return surgeControlViewList;
    }

    public void setSurgeControlViewList(List<SurgeControlView> surgeControlViewList) {
        this.surgeControlViewList = surgeControlViewList;
    }

}
