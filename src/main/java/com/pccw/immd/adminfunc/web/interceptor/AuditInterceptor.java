package com.pccw.immd.adminfunc.web.interceptor;


import com.pccw.immd.adminfunc.annotation.AccessAudit;
import com.pccw.immd.adminfunc.audit.AccessAuditService;
import com.pccw.immd.adminfunc.dto.LoginUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

import static com.pccw.immd.adminfunc.annotation.AccessAudit.AccessActionType;

/**
 * *
 * *  File Name   : AuditInterceptor.java
 * *  Create Date : 13 Feb 2018
 * *  Author      : Dell
 * *
 */
public class AuditInterceptor extends HandlerInterceptorAdapter {

    private static final Logger LOG = LoggerFactory.getLogger(AuditInterceptor.class);

    @Autowired
    @Qualifier("accessAuditService")
    public AccessAuditService accessAuditService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        LOG.debug("Pre-handle");
        if ( ! (handler instanceof HandlerMethod) ) {
            LOG.info(" Handler is not \"HandlerMethod\" class.");
            return true;
        }

        HandlerMethod hm = (HandlerMethod) handler;
        Method method = hm.getMethod();
        if (method.getDeclaringClass().isAnnotationPresent(Controller.class)) {
            if (method.isAnnotationPresent(AccessAudit.class)) {
                AccessAudit accessAudit = method.getAnnotation(AccessAudit.class);
                LOG.info(accessAudit.value().toString());
                LoginUser loginUser = (LoginUser)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
                AccessActionType action = accessAudit.value();
                String funcId = (String)request.getAttribute("funcId");
                accessAuditService.log(request.getRequestedSessionId(), loginUser, funcId, action);
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        LOG.debug("Post-handle");
//        HandlerMethod hm = (HandlerMethod) handler;
//        Method method = hm.getMethod();
//        if (method.getDeclaringClass().isAnnotationPresent(Controller.class)) {
//
//            if (method.isAnnotationPresent(AccessAudit.class)) {
//                LOG.info(method.getAnnotation(AccessAudit.class).value().toString());
//                request.setAttribute("ENDTIME", System.currentTimeMillis());
//            }
//        }
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        LOG.debug("After completion handle");
//        HandlerMethod hm = (HandlerMethod) handler;
//        Method method = hm.getMethod();
//        if (method.isAnnotationPresent(AccessAudit.class)) {
//            LOG.info(method.getAnnotation(AccessAudit.class).value().toString());
//            LOG.info("Total Took:" + ((Long) request.getAttribute("ENDTIME") - (Long) request.getAttribute("STARTTIME")));
//        }
    }
}