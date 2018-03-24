package com.pccw.immd.adminfunc.dto;

import com.pccw.immd.adminfunc.domain.Func;
import com.pccw.immd.commons.dto.BaseDTO;

import java.util.ArrayList;
import java.util.List;

public class FuncDTO extends BaseDTO {

    private List<Func> funcList =new ArrayList<>();

    public List<Func> getFuncList() {
        return funcList;
    }

    public void setFuncList(List<Func> funcList) {
        this.funcList = funcList;
    }
}
