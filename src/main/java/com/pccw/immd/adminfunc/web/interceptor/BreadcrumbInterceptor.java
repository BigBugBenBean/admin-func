package com.pccw.immd.adminfunc.web.interceptor;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** 
 ** 
 **  File Name   : BreadcrumbInterceptor.java
 **  Create Date : 7 Feb 2018
 **  Author      : Dell
 **
 */
public class BreadcrumbInterceptor extends HandlerInterceptorAdapter {
    
    private static final Logger LOG = LoggerFactory.getLogger(BreadcrumbInterceptor.class);
    private static final String BREADCRUMB_MENU_KEY = "BREADCRUMB_MENU_KEY";

    //before the actual handler will be executed
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
        throws Exception {

        long startTime = System.currentTimeMillis();
        return true;
    }

    //after the handler is executed
    public void postHandle(
        HttpServletRequest request, HttpServletResponse response, 
        Object handler, ModelAndView modelAndView)
        throws Exception {
    }


}
