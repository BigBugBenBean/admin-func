package com.pccw.immd.adminfunc.dto;

import com.pccw.immd.adminfunc.domain.SystemParam;
import com.pccw.immd.commons.dto.BaseDTO;

import java.util.ArrayList;
import java.util.List;

public class IvrsDTO extends BaseDTO {

    private List<SystemParam> systemParamList = new ArrayList<>();

    private String IVRS_STATUS_ES1;
    private String IVRS_STATUS_ES2;


    public List<SystemParam> getSystemParamList() {
        return systemParamList;
    }

    public void setSystemParamList(List<SystemParam> systemParamList) {
        this.systemParamList = systemParamList;
    }

    public String getIVRS_STATUS_ES1() {
        return IVRS_STATUS_ES1;
    }

    public void setIVRS_STATUS_ES1(String IVRS_STATUS_ES1) {
        this.IVRS_STATUS_ES1 = IVRS_STATUS_ES1;
    }

    public String getIVRS_STATUS_ES2() {
        return IVRS_STATUS_ES2;
    }

    public void setIVRS_STATUS_ES2(String IVRS_STATUS_ES2) {
        this.IVRS_STATUS_ES2 = IVRS_STATUS_ES2;
    }
}
