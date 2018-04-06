package com.pccw.immd.adminfunc.web.controller;

import com.pccw.immd.adminfunc.web.interceptor.BreadcrumbInterceptor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

import static com.pccw.immd.adminfunc.web.interceptor.BreadcrumbInterceptor.FUNC_ID_KEY;

@Controller
@RequestMapping(value = "/e-Services-2/management")
public class FunctionGroupController {


    /**
     * Create Function Group
     */

    @GetMapping(value = "/createFunctionGroup.do")
    public String createFuncGroupPage(HttpServletRequest request) {
        request.setAttribute(FUNC_ID_KEY, BreadcrumbInterceptor.FUNC_ID.Create_Function_Group);
        return "/eServices2/FuncGroup/create-func-group";
    }

    @GetMapping(value = "/createFunctionGroup_Success.do")
    public String createSuccessFuncGroupPage(HttpServletRequest request) {
        request.setAttribute(FUNC_ID_KEY, BreadcrumbInterceptor.FUNC_ID.Create_Function_Group);
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


}
