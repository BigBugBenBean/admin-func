package com.pccw.immd.adminfunc.web.interceptor;

import com.pccw.immd.adminfunc.service.FunctionService;
import com.pccw.immd.adminfunc.web.security.WebAuthorizationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

    public static final String FUNCTION_ID_KEY = "FUNCTION_ID_KEY";

    @Autowired
    @Qualifier ("functionService.eservice2")
    private FunctionService functionService;

    @Autowired
    @Qualifier("webAuthorizationService.eservice2")
    private WebAuthorizationService webAuthorizationService;

    //before the actual handler will be executed
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
        throws Exception {
        if (!webAuthorizationService.hasAuthorized())
            return true;

        String uri = request.getRequestURI();
        if (uri.startsWith(request.getContextPath())){
            uri = uri.substring(request.getContextPath().length());
        }
        String funcId = functionService.resolveFunctionId(uri);
        request.setAttribute(FUNCTION_ID_KEY, funcId);
        return true;
    }


}
