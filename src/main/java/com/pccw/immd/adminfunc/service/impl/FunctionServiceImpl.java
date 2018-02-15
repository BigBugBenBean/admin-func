package com.pccw.immd.adminfunc.service.impl;

import com.pccw.immd.adminfunc.service.FunctionService;
import org.apache.commons.lang.ArrayUtils;
import org.springframework.stereotype.Service;

@Service ("functionService.eservice2")
public class FunctionServiceImpl implements FunctionService {

    /**
      *  TODO: After Function Mapping implemented, update the hard-code logic
      */
    public String resoloveFunctionId(String uri){
        String funcId = "";
        String[] uriAry = uri.split("/");

        funcId = uriAry[uriAry.length - 1];
        funcId = new String(ArrayUtils.subarray(funcId.getBytes(), 0, 10));
        return funcId;
    }
}
