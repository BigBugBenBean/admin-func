package com.pccw.immd.adminfunc.web.interceptor;

import com.pccw.immd.adminfunc.dto.LoginUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** 
 ** 
 **  File Name   : PermissionInterceptor.java
 **  Create Date : 7 Feb 2018
 **  Author      : Dell
 **
 */
public class CommonVariableInterceptor extends HandlerInterceptorAdapter {

    public enum COMMON_VARIABLE {
        LOGIN_USER;

        @Override
        public String toString() {
            return this.name();
        }
    }

    private static final Logger LOG = LoggerFactory.getLogger(CommonVariableInterceptor.class);

    //before the actual handler will be executed
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        setLoginUser(request);
        return true;
    }

    private void setLoginUser(HttpServletRequest request){
        if (SecurityContextHolder.getContext().getAuthentication() != null) {
            Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            if (principal instanceof LoginUser) {
                LoginUser loginUser = (LoginUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
                request.setAttribute(COMMON_VARIABLE.LOGIN_USER.toString(), loginUser);
            }
        }
    }
}
