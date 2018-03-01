package com.pccw.immd.adminfunc.web.interceptor;

import com.pccw.immd.adminfunc.dto.LoginUser;
import com.pccw.immd.adminfunc.service.MenuService.MenuItem;
import com.pccw.immd.adminfunc.service.UpmsEndPointServiceWithHeader;
import com.pccw.immd.adminfunc.web.security.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import ws.upms.immd.v1.ITIAppException;
import ws.upms.immd.v1.ITISysException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceException;

import static com.pccw.immd.adminfunc.web.interceptor.MenuInterceptor.MENU_ROOT_KEY;
import static com.pccw.immd.adminfunc.web.security.AdminFuncAuthenticationFailureHandler.SPRING_SECURITY_LAST_EXCEPTION;

/** 
 ** 
 **  File Name   : PermissionInterceptor.java
 **  Create Date : 7 Feb 2018
 **  Author      : Dell
 **
 */
public class PermissionInterceptor extends HandlerInterceptorAdapter {

    private static final Logger LOG = LoggerFactory.getLogger(PermissionInterceptor.class);

    @Autowired
    @Qualifier("umpsEndPointServiceWithHeader")
    private UpmsEndPointServiceWithHeader upmsService;

    //before the actual handler will be executed
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
        throws Exception {

        try {
            // Validate ImmdToken with every request.
            validateImmdToken();

        } catch (WebServiceException exception) {
            if (LOG.isDebugEnabled()) {
                LOG.debug("WebServiceException occur with validateImmdToken Endpoint.");
            }
            throw exception;

        } catch ( ITIAppException |  ITISysException exception ) {
            request.setAttribute("EXCEPTION_MESSAGE", exception.getMessage());
            request.getSession().setAttribute(SPRING_SECURITY_LAST_EXCEPTION, exception);
            SecurityContext context1 = SecurityContextHolder.getContext();
            context1.setAuthentication(null);
            response.sendRedirect(request.getContextPath() +"/AUTH/no-permission.do");
            return false;
        }
        String uri = request.getRequestURI();
        /**
         * TODO: Replace logic when access right mapping defined.
         */
        if (uri.indexOf("noPermission.do") > -1) {
            LOG.info("No Permission");
            response.sendRedirect(request.getContextPath() +"/AUTH/no-permission.do");
            return false;
        }

        resolveMenuAccessRight(request);
        return true;
    }

    private String getLoginId(Object exception) {
        util.itifwk.immd.v1.ITIAppException appEx = ExceptionUtils.getUmpsException(exception);
        if (appEx != null) {
            return appEx.getLoginId();
        }
        return null;
    }

    /**
     * TODO: Here should check the menu access right with database / UPMS return values
     */
    private void validateImmdToken() throws Exception {
        String userId = null;
        if (SecurityContextHolder.getContext() != null
                && SecurityContextHolder.getContext().getAuthentication() != null
                && SecurityContextHolder.getContext().getAuthentication().getPrincipal() != null
                && !(SecurityContextHolder.getContext().getAuthentication().getPrincipal() instanceof String) ) {

            userId = SecurityContextHolder.getContext().getAuthentication().getName();
            String immdToken = ((LoginUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getImmdToken();

            boolean isDemo = isDemoAccount(userId);
            if (!isDemo) {
                upmsService.validateImmdToken(userId, immdToken);
            }


        } else {
            if (LOG.isDebugEnabled())
                LOG.debug("Not immdToken found, loginId=" + userId);
        }
    }

    /**
     * TODO: Here should check the menu access right with database / UPMS return values
     */
    private void resolveMenuAccessRight(HttpServletRequest request) {
        MenuItem applicationMenu = (MenuItem)request.getAttribute( MENU_ROOT_KEY );

    }


    private boolean isDemoAccount(String loginId) {
        boolean isDemo = false;

        String demoPrefix = "demo";
        if (loginId.contains(demoPrefix)) {
            isDemo = true;
        }

        return isDemo;
    }

}
