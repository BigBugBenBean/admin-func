package com.pccw.immd.adminfunc.web.controller;

import com.pccw.immd.adminfunc.domain.AccessControl;
import com.pccw.immd.adminfunc.domain.AccessControlGlobalParam;
import com.pccw.immd.adminfunc.dto.AccessControlDTO;
import com.pccw.immd.adminfunc.dto.AccessControlGlobalParamsDTO;
import com.pccw.immd.adminfunc.service.AccessControlService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AccessControlController {

    private static final Logger LOG = LoggerFactory.getLogger(AccessControlController.class);

    @Autowired
    @Qualifier("accessControlService.eservice2")   private AccessControlService accessControlService;

    @GetMapping(value = "/e-Services-2/maintenance/accessControl.do")
    public String accessControlPage(@ModelAttribute AccessControlDTO accessControlDTO) {
        List<AccessControl> list = accessControlService.listAll();
        
        if (list.size() > 0) {
            accessControlDTO.setAccessControlList(list);
        }

        return "/eServices2/AccessControl/access-control";
    }

    @GetMapping(value = "/e-Services-2/maintenance/accessControl_Global.do")
    public String accessControlGlobalPage(@ModelAttribute AccessControlDTO accessControlDTO) {
        List<AccessControlGlobalParam> params = accessControlService.getGlobalParam();

        if (params.size() > 0) {
            accessControlDTO.setAccessControlGlobalParamList(params);
        }

        return "/eServices2/AccessControl/access-control-global";
    }

    @PostMapping(value = "/e-Services-2/maintenance/accessControl_GlobalParamsSave.do")
    public String saveAccessControlGlobalParams(@ModelAttribute AccessControlGlobalParamsDTO accessControlGlobalParamsDTO) {

        accessControlService.updateGlobalParam(accessControlGlobalParamsDTO);

        return "/eServices2/AccessControl/access-control-global-success";
    }

//    @GetMapping(value = "/accessControlGlobalSuccess.do")
//    public String accessControlGlobalSuccessPage() {
//        return "/eServices2/AccessControl/access-control-global-success";
//    }

    @GetMapping(value = "/e-Services-2/maintenance/accessControl_Create.do")
    public String accessControlCreatePage() {
        return "/eServices2/AccessControl/access-control-create";
    }

    @GetMapping(value = "/e-Services-2/maintenance/accessControl_CreateSuccess.do")
    public String accessControlCreateSuccessPage() {
        return "/eServices2/AccessControl/access-control-create-success";
    }

    @GetMapping(value = "/e-Services-2/maintenance/accessControl_View.do")
    public String accessControlViewPage() {
        return "/eServices2/AccessControl/access-control-view";
    }

}
