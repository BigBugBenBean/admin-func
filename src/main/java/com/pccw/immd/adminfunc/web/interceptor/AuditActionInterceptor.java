package com.pccw.immd.adminfunc.web.interceptor;


import com.pccw.immd.adminfunc.annotation.AccessAudit;
import com.pccw.immd.adminfunc.audit.AuditTrailSearchService;
import com.pccw.immd.adminfunc.dto.LoginUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

import static com.pccw.immd.adminfunc.annotation.AccessAudit.AccessActionType;

/**
 * *
 * *  File Name   : AuditActionInterceptor.java
 * *  Create Date : 13 Feb 2018
 * *  Author      : Dell
 * *
 */
public class AuditActionInterceptor extends HandlerInterceptorAdapter {

    private static final Logger LOG = LoggerFactory.getLogger(AuditActionInterceptor.class);

    @Autowired
    @Qualifier("auditTrailSearch")
    public AuditTrailSearchService auditTrailSearch;

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
                auditTrailSearch.log(request.getRequestedSessionId(), loginUser, funcId, action);
            }
        }
        return true;
    }
}