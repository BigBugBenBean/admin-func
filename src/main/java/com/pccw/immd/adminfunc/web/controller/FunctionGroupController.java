package com.pccw.immd.adminfunc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/e-Services-2/management")
public class FunctionGroupController {


    /**
     * Create Function Group
     */

    @GetMapping(value = "/createFunctionGroup.do")
    public String createFuncGroupPage() {
        return "/eServices2/FuncGroup/create-func-group";
    }

    @GetMapping(value = "/createFunctionGroup_Success.do")
    public String createSuccessFuncGroupPage() {
        return "/eServices2/FuncGroup/create-func-group-success";
    }

    /**
     * Update Function Group
     */
    @GetMapping(value = "/updateFunctionGroup.do")
    public String updateFuncGroupPage() {
        return "/eServices2/FuncGroup/update-func-group-search";
    }

    @GetMapping(value = "/updateFunctionGroup_Edit.do")
    public String editFuncGroupPage() {
        return "/eServices2/FuncGroup/update-func-group-edit";
    }

    @GetMapping(value = "/updateFunctionGroup_Success.do")
    public String editSuccessFuncGroupPage() {
        return "/eServices2/FuncGroup/update-func-group-edit-success";
    }


    /**
     * Delete Function Group
     */
    @GetMapping(value = "/deleteFunctionGroup.do")
    public String deleteFuncGroupPage() {
        return "/eServices2/FuncGroup/delete-func-group-search";
    }

    @GetMapping(value = "/deleteFunctionGroup_Result.do")
    public String deleteResultFuncGroupPage() {
        return "/eServices2/FuncGroup/delete-func-group-result";
    }

    @GetMapping(value = "/deleteFunctionGroup_Success.do")
    public String deleteResultSccessFuncGroupPage() {
        return "/eServices2/FuncGroup/delete-func-group-result-success";
    }


}
