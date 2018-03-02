package com.pccw.immd.adminfunc.dto;

import com.pccw.immd.adminfunc.domain.ApplicationCode;
import com.pccw.immd.commons.dto.BaseDTO;

import java.util.ArrayList;
import java.util.List;

public class ApplicationFeeEnquiryDTO extends BaseDTO {

    private List<ApplicationCode> applicationCodeList = new ArrayList<>();

    public List<ApplicationCode> getApplicationCodeList() {
        return applicationCodeList;
    }

    public void setApplicationCodeList(List<ApplicationCode> applicationCodeList) {
        this.applicationCodeList = applicationCodeList;
    }
}
