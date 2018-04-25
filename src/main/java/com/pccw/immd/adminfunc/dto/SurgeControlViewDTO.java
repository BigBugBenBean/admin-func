package com.pccw.immd.adminfunc.dto;

import com.pccw.immd.adminfunc.domain.SctlSvcCfg;
import com.pccw.immd.commons.dto.BaseDTO;

import java.util.ArrayList;
import java.util.List;

public class SurgeControlViewDTO extends BaseDTO {

    private String appId;
    private Integer gst;
    private String description;
    private Integer mst;
    private Integer priority;
    private String clawback;
    private List<SctlSvcCfg> surgeControlViewList = new ArrayList<>();

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public Integer getGst() {
        return gst;
    }

    public void setGst(Integer gst) {
        this.gst = gst;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getMst() {
        return mst;
    }

    public void setMst(Integer mst) {
        this.mst = mst;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getClawback() {
        return clawback;
    }

    public void setClawback(String clawback) {
        this.clawback = clawback;
    }

    public List<SctlSvcCfg> getSurgeControlViewList() {
        return surgeControlViewList;
    }

    public void setSurgeControlViewList(List<SctlSvcCfg> surgeControlViewList) {
        this.surgeControlViewList = surgeControlViewList;
    }
}
