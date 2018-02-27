package com.pccw.immd.adminfunc.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pccw.immd.commons.dto.BaseDTO;

import javax.validation.Valid;

public class AccessControlGlobalParamsDTO extends BaseDTO {

    @Valid
    @JsonProperty("WHITE_LIST_ACTIVATE")
    private Boolean WHITE_LIST_ACTIVATE = false;

    @Valid
    @JsonProperty("BLACK_LIST_ACTIVATE")
    private Boolean BLACK_LIST_ACTIVATE = false;

    @Valid
    @JsonProperty("COUNTER_BLOCKING_ACTIVATE")
    private Boolean COUNTER_BLOCKING_ACTIVATE = false;

    @Valid
    @JsonProperty("MAX_TRANS")
    private Integer MAX_TRANS = -1;

    @Valid
    @JsonProperty("MAX_TRANS_PERIOD")
    private Integer MAX_TRANS_PERIOD = -1;

    @Valid
    @JsonProperty("MAX_APM")
    private Integer MAX_APM = -1;

    @Valid
    @JsonProperty("MAX_APM_PERIOD")
    private Integer MAX_APM_PERIOD = -1;


    public Boolean getWHITE_LIST_ACTIVATE() {
        return WHITE_LIST_ACTIVATE;
    }

    public void setWHITE_LIST_ACTIVATE(Boolean WHITE_LIST_ACTIVATE) {
        this.WHITE_LIST_ACTIVATE = WHITE_LIST_ACTIVATE;
    }

    public Boolean getBLACK_LIST_ACTIVATE() {
        return BLACK_LIST_ACTIVATE;
    }

    public void setBLACK_LIST_ACTIVATE(Boolean BLACK_LIST_ACTIVATE) {
        this.BLACK_LIST_ACTIVATE = BLACK_LIST_ACTIVATE;
    }

    public Boolean getCOUNTER_BLOCKING_ACTIVATE() {
        return COUNTER_BLOCKING_ACTIVATE;
    }

    public void setCOUNTER_BLOCKING_ACTIVATE(Boolean COUNTER_BLOCKING_ACTIVATE) {
        this.COUNTER_BLOCKING_ACTIVATE = COUNTER_BLOCKING_ACTIVATE;
    }

    public Integer getMAX_TRANS() {
        return MAX_TRANS;
    }

    public void setMAX_TRANS(Integer MAX_TRANS) {
        this.MAX_TRANS = MAX_TRANS;
    }

    public Integer getMAX_TRANS_PERIOD() {
        return MAX_TRANS_PERIOD;
    }

    public void setMAX_TRANS_PERIOD(Integer MAX_TRANS_PERIOD) {
        this.MAX_TRANS_PERIOD = MAX_TRANS_PERIOD;
    }

    public Integer getMAX_APM() {
        return MAX_APM;
    }

    public void setMAX_APM(Integer MAX_APM) {
        this.MAX_APM = MAX_APM;
    }

    public Integer getMAX_APM_PERIOD() {
        return MAX_APM_PERIOD;
    }

    public void setMAX_APM_PERIOD(Integer MAX_APM_PERIOD) {
        this.MAX_APM_PERIOD = MAX_APM_PERIOD;
    }
}
