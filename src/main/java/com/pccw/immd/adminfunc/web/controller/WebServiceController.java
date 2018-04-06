package com.pccw.immd.adminfunc.web.controller;


import com.pccw.immd.adminfunc.service.EnquireTrxGrpEndPointService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ws.cds.immd.v1.*;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

//@Component
//@WebService(targetNamespace = "http://web.adminfunc.immd.pccw.com")
@Controller
@RequestMapping(value ="/icons/upms")
public class WebServiceController implements EnquireTransactionGroupServiceWS {

    static final Logger logger = LoggerFactory.getLogger(WebServiceController.class);

    @Autowired
    EnquireTrxGrpEndPointService enquireTrxGrpEndPointService;


    @WebMethod
    @PostMapping("/EnquireTransactionGroupServiceWSImplPortImpl.do")
    public RoleTxgpTxidDTO enquireAllData() throws VLDExceptionException, CoreAppExceptionException {
        logger.debug("Starting enquireAllData..");
        RoleTxgpTxidDTO roleTxgpTxidDTO = enquireTrxGrpEndPointService.enquireAllData();
        return roleTxgpTxidDTO;
    }

    @WebMethod
    public List<TransGrpRoleDTO> enquireTransactionGroup(List<String> roleCdList) throws VLDExceptionException, CoreAppExceptionException {
        logger.debug("Starting enquireTransactionGroup..");
        return null;
    }

    @WebMethod
    public List<Txid> enquireTxIDsByRoleCd(String roleCd) {
        logger.debug("Starting enquireTxIDsByRoleCd..");
        return null;
    }
}
