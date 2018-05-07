package com.pccw.immd.adminfunc.dto;

import com.pccw.immd.adminfunc.domain.ApplicationCode;
import com.pccw.immd.adminfunc.domain.VPricePayment;
import com.pccw.immd.commons.dto.BaseDTO;

import java.util.ArrayList;
import java.util.List;

public class ApplicationFeeEnquiryDTO extends BaseDTO {

    private List<VPricePayment> applicationCodeList = new ArrayList<>();

    public List<VPricePayment> getApplicationCodeList() {
        return applicationCodeList;
    }

    public void setApplicationCodeList(List<VPricePayment> applicationCodeList) {
        this.applicationCodeList = applicationCodeList;
    }
}
