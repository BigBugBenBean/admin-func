package com.pccw.immd.adminfunc.service.impl;

import com.pccw.immd.adminfunc.domain.Func;
import com.pccw.immd.adminfunc.repository.FuncRepository;
import com.pccw.immd.adminfunc.service.FunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service ("functionService.eservice2")
public class FunctionServiceImpl implements FunctionService {

    @Autowired
    @Qualifier("funcRepository")
    private FuncRepository funcRepository;

    /**
      *  TODO: After Function Mapping implemented, update the hard-code logic
      */
    public String resolveFunctionId(String uri){
        Func func = funcRepository.getByDestUrl(uri);
        String funcId = (func != null)?func.getFuncId():null;
        return funcId;
    }
}
