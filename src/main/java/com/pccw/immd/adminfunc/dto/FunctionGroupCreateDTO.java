package com.pccw.immd.adminfunc.dto;

import com.pccw.immd.adminfunc.domain.Func;
import com.pccw.immd.commons.dto.BaseDTO;

import java.util.ArrayList;
import java.util.List;

public class FunctionGroupCreateDTO extends BaseDTO {

    private String grpId;
    private String groupDesc;
    private List<String> currentFunc = new ArrayList<>();
    private List<Func> availableFunctions = new ArrayList<>();
    private List<Func> funcDetails = new ArrayList<>();

    public String getGrpId() {
        return grpId;
    }

    public void setGrpId(String grpId) {
        this.grpId = grpId;
    }

    public String getGroupDesc() {
        return groupDesc;
    }

    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
    }

    public List<String> getCurrentFunc() {
        return currentFunc;
    }

    public void setCurrentFunc(List<String> currentFunc) {
        this.currentFunc = currentFunc;
    }

    public List<Func> getAvailableFunctions() {
        return availableFunctions;
    }

    public void setAvailableFunctions(List<Func> availableFunctions) {
        this.availableFunctions = availableFunctions;
    }

    public List<Func> getFuncDetails() {
        return funcDetails;
    }

    public void setFuncDetails(List<Func> funcDetails) {
        this.funcDetails = funcDetails;
    }

}
