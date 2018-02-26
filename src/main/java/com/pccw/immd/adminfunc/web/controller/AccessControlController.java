package com.pccw.immd.adminfunc.web.controller;

import com.pccw.immd.adminfunc.domain.AccessControl;
import com.pccw.immd.adminfunc.domain.AccessControlGlobalParam;
import com.pccw.immd.adminfunc.dto.AccessControlDTO;
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

    @GetMapping(value = "/accessControl.do")
    public String accessControlPage(@ModelAttribute AccessControlDTO accessControlDTO) {
        List<AccessControl> list = accessControlService.listAll();
        
        if (list.size() > 0) {
            accessControlDTO.setAccessControlList(list);
        }

        return "/eServices2/AccessControl/access-control";
    }

    @GetMapping(value = "/accessControlGlobal.do")
    public String accessControlGlobalPage(@ModelAttribute AccessControlDTO accessControlDTO) {
        List<AccessControlGlobalParam> params = accessControlService.getGlobalParam();

        if (params.size() > 0) {
            accessControlDTO.setAccessControlGlobalParamList(params);
        }

        return "/eServices2/AccessControl/access-control-global";
    }

    @PostMapping(value = "/saveAccessControlGlobalParams.do")
    public String saveAccessControlGlobalParams() {

        return "/eServices2/AccessControl/access-control-global-success";
    }

    @GetMapping(value = "/accessControlGlobalSuccess.do")
    public String accessControlGlobalSuccessPage() {
        return "/eServices2/AccessControl/access-control-global-success";
    }

    @GetMapping(value = "/createAccessControl.do")
    public String accessControlCreatePage() {
        return "/eServices2/AccessControl/access-control-create";
    }

    @GetMapping(value = "/createAccessControlSuccess.do")
    public String accessControlCreateSuccessPage() {
        return "/eServices2/AccessControl/access-control-create-success";
    }

    @GetMapping(value = "/accessControlView.do")
    public String accessControlViewPage() {
        return "/eServices2/AccessControl/access-control-view";
    }

}
