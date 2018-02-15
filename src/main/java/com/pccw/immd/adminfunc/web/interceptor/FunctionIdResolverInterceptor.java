package com.pccw.immd.adminfunc.web.interceptor;

import com.pccw.immd.adminfunc.service.FunctionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** 
 ** 
 **  File Name   : FunctionIdResolverInterceptor.java
 **  Create Date : 14 Feb 2018
 **  Author      : Dell
 **
 */
public class FunctionIdResolverInterceptor extends HandlerInterceptorAdapter {

    private static final Logger LOG = LoggerFactory.getLogger(FunctionIdResolverInterceptor.class);

    public static String FUNCTION_ID_KEY = "FUNCTION_ID_KEY";

    @Autowired
    @Qualifier ("functionService.eservice2")
    private FunctionService functionService;

    //before the actual handler will be executed
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
        throws Exception {

        long startTime = System.currentTimeMillis();
        request.setAttribute("PermissionInterceptor ... startTime", startTime);

        request.setAttribute("startTime", startTime);

        String funcId = functionService.resoloveFunctionId(request.getRequestURI());
        request.setAttribute("FUNCTION_ID_KEY", funcId);

        request.setAttribute("startTime", startTime);
        return true;
    }


}
