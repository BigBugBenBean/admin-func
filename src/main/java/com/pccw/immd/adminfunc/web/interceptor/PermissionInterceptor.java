package com.pccw.immd.adminfunc.web.interceptor;

import com.pccw.immd.adminfunc.service.MenuService.MenuItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.pccw.immd.adminfunc.web.interceptor.MenuInterceptor.MENU_ROOT_KEY;

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

    /**
     * TODO: Here should check the menu access right with database / UPMS return values
     */
    private void resolveMenuAccessRight(HttpServletRequest request) {
        MenuItem applicationMenu = (MenuItem)request.getAttribute( MENU_ROOT_KEY );

    }
}
