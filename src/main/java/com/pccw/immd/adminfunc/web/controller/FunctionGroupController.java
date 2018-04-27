package com.pccw.immd.adminfunc.web.controller;

import com.pccw.immd.adminfunc.domain.Func;
import com.pccw.immd.adminfunc.domain.Group;
import com.pccw.immd.adminfunc.domain.GroupFunc;
import com.pccw.immd.adminfunc.domain.id.GroupFuncId;
import com.pccw.immd.adminfunc.dto.FunctionGroupCreateDTO;
import com.pccw.immd.adminfunc.repository.FuncRepository;
import com.pccw.immd.adminfunc.repository.GroupFuncRepository;
import com.pccw.immd.adminfunc.repository.GroupRepository;
import com.pccw.immd.adminfunc.web.interceptor.BreadcrumbInterceptor;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

import java.util.Date;
import java.util.List;

import static com.pccw.immd.adminfunc.web.interceptor.BreadcrumbInterceptor.FUNC_ID_KEY;

@Controller
@RequestMapping(value = "/e-Services-2/management")
public class FunctionGroupController {

    private static final Logger LOG = Logger.getLogger(FunctionGroupController.class);

    @Autowired
    FuncRepository funcRepository;

    @Autowired
    GroupFuncRepository groupFuncRepository;

    @Autowired
    GroupRepository groupRepository;


    /**
     * Create Function Group
     */

    @GetMapping(value = "/createFunctionGroup.do")
    public String createFuncGroupPage(HttpServletRequest request, Model model) {
        request.setAttribute(FUNC_ID_KEY, BreadcrumbInterceptor.FUNC_ID.Create_Function_Group);

        model.addAttribute("currentFunctions", funcRepository.findAll());
        model.addAttribute("availableFunctions", funcRepository.findAll());
        return "/eServices2/FuncGroup/create-func-group";
    }

    @PostMapping(value = "/createFunctionGroup_Success.do")
    public String createSuccessFuncGroupPage(HttpServletRequest request,
            @ModelAttribute FunctionGroupCreateDTO functionGroupCreateDTO) {
        request.setAttribute(FUNC_ID_KEY, BreadcrumbInterceptor.FUNC_ID.Create_Function_Group);

        List<String> functionList = functionGroupCreateDTO.getCurrentFunc();
        String groupId = functionGroupCreateDTO.getGrpId();
        String groupDesc = functionGroupCreateDTO.getGroupDesc();
        String userId = request.getRequestedSessionId();
        List<Func> functionsDetails = funcRepository.findByFuncIdIn(functionList);

        createNewGroup(groupId, groupDesc, userId);
        createGroupFunc(groupId, functionList);

        functionGroupCreateDTO.setFuncDetails(functionsDetails);
        return "/eServices2/FuncGroup/create-func-group-success";
    }

    /**
     * Update Function Group
     */
    @GetMapping(value = "/updateFunctionGroup.do")
    public String updateFuncGroupPage(HttpServletRequest request) {
        request.setAttribute(FUNC_ID_KEY, BreadcrumbInterceptor.FUNC_ID.Update_Function_Group);
        return "/eServices2/FuncGroup/update-func-group-search";
    }

    @GetMapping(value = "/updateFunctionGroup_Edit.do")
    public String editFuncGroupPage(HttpServletRequest request) {
        request.setAttribute(FUNC_ID_KEY, BreadcrumbInterceptor.FUNC_ID.Update_Function_Group);
        return "/eServices2/FuncGroup/update-func-group-edit";
    }

    @GetMapping(value = "/updateFunctionGroup_Success.do")
    public String editSuccessFuncGroupPage(HttpServletRequest request) {
        request.setAttribute(FUNC_ID_KEY, BreadcrumbInterceptor.FUNC_ID.Update_Function_Group);
        return "/eServices2/FuncGroup/update-func-group-edit-success";
    }


    /**
     * Delete Function Group
     */
    @GetMapping(value = "/deleteFunctionGroup.do")
    public String deleteFuncGroupPage(HttpServletRequest request) {
        request.setAttribute(FUNC_ID_KEY, BreadcrumbInterceptor.FUNC_ID.Delete_Function_Group);
        return "/eServices2/FuncGroup/delete-func-group-search";
    }

    @GetMapping(value = "/deleteFunctionGroup_Result.do")
    public String deleteResultFuncGroupPage(HttpServletRequest request) {
        request.setAttribute(FUNC_ID_KEY, BreadcrumbInterceptor.FUNC_ID.Delete_Function_Group);
        return "/eServices2/FuncGroup/delete-func-group-result";
    }

    @GetMapping(value = "/deleteFunctionGroup_Success.do")
    public String deleteResultSccessFuncGroupPage(HttpServletRequest request) {
        request.setAttribute(FUNC_ID_KEY, BreadcrumbInterceptor.FUNC_ID.Delete_Function_Group);
        return "/eServices2/FuncGroup/delete-func-group-result-success";
    }

    private void createNewGroup(String groupId, String groupDesc, String userId) {
        LOG.debug("Creating new group " + groupId);

        Group createdGroup = new Group();
        createdGroup.setGroupId(groupId);
        createdGroup.setGroupDesc(groupDesc);
        createdGroup.setDisplayPos("");
        createdGroup.setLstUpdTd(new Date());
        groupRepository.save(createdGroup);
    }

    private void createGroupFunc(String id, List<String> functionIds){

        for (String funcId : functionIds) {
            GroupFunc groupFunc = new GroupFunc();
            GroupFuncId groupFuncId = new GroupFuncId();
            groupFuncId.setGrpId(id);
            groupFuncId.setFuncId(funcId);
            groupFunc.setId(groupFuncId);
            groupFuncRepository.save(groupFunc);
        }
    }

}
