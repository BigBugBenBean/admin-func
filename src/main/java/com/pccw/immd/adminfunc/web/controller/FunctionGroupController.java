package com.pccw.immd.adminfunc.web.controller;

import com.pccw.immd.adminfunc.domain.Func;
import com.pccw.immd.adminfunc.domain.Group;
import com.pccw.immd.adminfunc.domain.GroupFunc;
import com.pccw.immd.adminfunc.domain.RoleGroup;
import com.pccw.immd.adminfunc.domain.id.GroupFuncId;
import com.pccw.immd.adminfunc.dto.FunctionGroupCreateDTO;
import com.pccw.immd.adminfunc.repository.FuncRepository;
import com.pccw.immd.adminfunc.repository.GroupFuncRepository;
import com.pccw.immd.adminfunc.repository.GroupRepository;
import com.pccw.immd.adminfunc.repository.RoleGroupRepository;
import com.pccw.immd.adminfunc.service.FunctionGroupService;
import com.pccw.immd.adminfunc.web.interceptor.BreadcrumbInterceptor;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import static com.pccw.immd.adminfunc.web.interceptor.BreadcrumbInterceptor.FUNC_ID_KEY;

@Controller
@RequestMapping(value = "/e-Services-2/management")
public class FunctionGroupController {

    private static final Logger LOG = Logger.getLogger(FunctionGroupController.class);

    @Autowired
    @Qualifier("functionGroupService.eservices2")
    FunctionGroupService functionGroupService;

    @Autowired
    FuncRepository funcRepository;

    @Autowired
    GroupRepository groupRepository;

    @Autowired
    RoleGroupRepository roleGroupRepository;

    /**
     * Create Function Group
     */

    @GetMapping(value = "/createFunctionGroup.do")
    public String createFuncGroupPage(HttpServletRequest request, Model model, @ModelAttribute FunctionGroupCreateDTO functionGroupCreateDTO) {
        request.setAttribute(FUNC_ID_KEY, BreadcrumbInterceptor.FUNC_ID.Create_Function_Group);
        model.addAttribute("availableFunctions", funcRepository.findAll());
        return "/eServices2/FuncGroup/create-func-group";
    }

    @PostMapping(value = "/createFunctionGroup_Success.do")
    public String createSuccessFuncGroupPage(HttpServletRequest request,
            @ModelAttribute FunctionGroupCreateDTO functionGroupCreateDTO) {
        request.setAttribute(FUNC_ID_KEY, BreadcrumbInterceptor.FUNC_ID.Create_Function_Group);

        List<Func> functionsDetails = funcRepository.findByFuncIdIn(functionGroupCreateDTO.getCurrentFunc());
        functionGroupService.createNewGroupFuncGroup(functionGroupCreateDTO);

        functionGroupCreateDTO.setFuncDetails(functionsDetails);
        return "/eServices2/FuncGroup/create-func-group-success";
    }

    /**
     * Update Function Group
     */
    @GetMapping(value = "/updateFunctionGroup.do")
    public String updateFuncGroupPage(HttpServletRequest request, Model model,
                                      @ModelAttribute FunctionGroupCreateDTO functionGroupCreateDTO) {
        request.setAttribute(FUNC_ID_KEY, BreadcrumbInterceptor.FUNC_ID.Update_Function_Group);

        model.addAttribute("groupIds", groupRepository.findAll(new Sort(Sort.Direction.ASC, "groupId")));
        return "/eServices2/FuncGroup/update-func-group-search";
    }

    @PostMapping(value = "/updateFunctionGroup_Edit.do")
    public String editFuncGroupPage(HttpServletRequest request, Model model,
                                    @ModelAttribute FunctionGroupCreateDTO functionGroupCreateDTO) {
        request.setAttribute(FUNC_ID_KEY, BreadcrumbInterceptor.FUNC_ID.Update_Function_Group);

        if (functionGroupCreateDTO.getGrpId() != null) {
            HashMap list = functionGroupService.loadGroupFunction(functionGroupCreateDTO.getGrpId());

            String groupId = (String) list.get("groupid");
            String groupDesc = (String) list.get("groupDesc");
            List<String> functionList = (List<String>) list.get("functionList");

            functionGroupCreateDTO.setGroupDesc(groupDesc);
            if (functionList != null && functionList.size() != 0) {
                model.addAttribute("currentFunc", funcRepository.findByFuncIdIn(functionList));
                model.addAttribute("availableFunctions", funcRepository.findByFuncIdNotIn(functionList));
            } else {
                model.addAttribute("currentFunc", null);
                model.addAttribute("availableFunctions", funcRepository.findAll());
            }

        }
        return "/eServices2/FuncGroup/update-func-group-edit";
    }

    @PostMapping(value = "/updateFunctionGroup_Success.do")
    public String editSuccessFuncGroupPage(HttpServletRequest request, Model model,
        @ModelAttribute FunctionGroupCreateDTO functionGroupCreateDTO) {
        request.setAttribute(FUNC_ID_KEY, BreadcrumbInterceptor.FUNC_ID.Update_Function_Group);

        functionGroupService.updateGroupFunction(functionGroupCreateDTO);
        model.addAttribute("currentFunc", funcRepository.findByFuncIdIn(functionGroupCreateDTO.getCurrentFunc()));

        return "/eServices2/FuncGroup/update-func-group-edit-success";
    }

    /**
     * Delete Function Group
     */
    @GetMapping(value = "/deleteFunctionGroup.do")
    public String deleteFuncGroupPage(HttpServletRequest request, Model model,
                                      @ModelAttribute FunctionGroupCreateDTO functionGroupCreateDTO) {
        request.setAttribute(FUNC_ID_KEY, BreadcrumbInterceptor.FUNC_ID.Delete_Function_Group);
        model.addAttribute("groupIds", groupRepository.findAll(new Sort(Sort.Direction.ASC, "groupId")));
        return "/eServices2/FuncGroup/delete-func-group-search";
    }

    @PostMapping(value = "/deleteFunctionGroup_Result.do")
    public String deleteResultFuncGroupPage(HttpServletRequest request, Model model,
                                            @ModelAttribute FunctionGroupCreateDTO functionGroupCreateDTO) {
        request.setAttribute(FUNC_ID_KEY, BreadcrumbInterceptor.FUNC_ID.Delete_Function_Group);
        functionGroupCreateDTO.setGroupDesc(groupRepository.findByGroupId(functionGroupCreateDTO.getGrpId()).getGroupDesc());
        functionGroupCreateDTO.setCurrentFunc(funcRepository.findFuncByGroupId(functionGroupCreateDTO.getGrpId()));
        model.addAttribute("currentFunc", funcRepository.findByFuncIdIn(functionGroupCreateDTO.getCurrentFunc()));
        return "/eServices2/FuncGroup/delete-func-group-result";
    }

    @PostMapping(value = "/deleteFunctionGroup_Success.do")
    public String deleteResultSuccessFuncGroupPage(HttpServletRequest request,  Model model,
                                                   @ModelAttribute FunctionGroupCreateDTO functionGroupCreateDTO) {
        request.setAttribute(FUNC_ID_KEY, BreadcrumbInterceptor.FUNC_ID.Delete_Function_Group);
        functionGroupCreateDTO.setCurrentFunc(funcRepository.findFuncByGroupId(functionGroupCreateDTO.getGrpId()));
        functionGroupCreateDTO.setGroupDesc(groupRepository.findByGroupId(functionGroupCreateDTO.getGrpId()).getGroupDesc());
        model.addAttribute("currentFunc", funcRepository.findByFuncIdIn(functionGroupCreateDTO.getCurrentFunc()));
        functionGroupService.deleteRoleGroupFunction(functionGroupCreateDTO.getGrpId());
        return "/eServices2/FuncGroup/delete-func-group-result-success";
    }

}
