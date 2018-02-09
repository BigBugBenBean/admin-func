package com.pccw.immd.adminfunc.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/** 
 ** 
 **  File Name   : PermissionInterceptor.java
 **  Create Date : 7 Feb 2018
 **  Author      : Dell
 **
 */
public class PermissionInterceptor extends HandlerInterceptorAdapter {

    private static final Logger LOG = LoggerFactory.getLogger(PermissionInterceptor.class);

    //before the actual handler will be executed
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
        throws Exception {

        long startTime = System.currentTimeMillis();
        request.setAttribute("PermissionInterceptor ... startTime", startTime);

        request.setAttribute("startTime", startTime);
        return true;
    }

    //after the handler is executed
    public void postHandle(
        HttpServletRequest request, HttpServletResponse response, 
        Object handler, ModelAndView modelAndView)
        throws Exception {
        
        if (request == null )
            return;
        
        long startTime = (Long)request.getAttribute("startTime");
        
        long endTime = System.currentTimeMillis();

        long executeTime = endTime - startTime;
        
        //modified the exisitng modelAndView
        if (modelAndView != null)
            modelAndView.addObject("executeTime",executeTime);
        
        //log it
        if(LOG.isDebugEnabled()){
            LOG.debug("[" + handler + "] executeTime : " + executeTime + "ms");
            LOG.debug("PermissionInterceptor ... ");
        }
    }
}
