package com.pccw.immd.adminfunc.web.interceptor;

import static com.pccw.immd.adminfunc.service.MenuService.MENU_ROOT_KEY;
import static com.pccw.immd.adminfunc.service.MenuService.FUNC_MENU_KEY;

import com.pccw.immd.adminfunc.service.MenuService.MenuItem;
import com.pccw.immd.adminfunc.dto.LoginUser;
import com.pccw.immd.adminfunc.service.MenuService;
import com.pccw.immd.adminfunc.service.UserMenuService;
import com.pccw.immd.adminfunc.web.security.WebAuthorizationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/** 
 **
 **  File Name   : MenuInterceptor.java
 **  Create Date : 7 Feb 2018
 **  Author      : Dell
 **
 */
public class MenuInterceptor extends HandlerInterceptorAdapter {

    private static final Logger LOG = LoggerFactory.getLogger(MenuInterceptor.class);
    private MenuService.MenuItem applicationMenu;

    @Autowired
    @Qualifier("menuService.eservices2")
    MenuService menuService;

    @Autowired
    @Qualifier("userMenuService")
    private UserMenuService userMenuService;

    @Autowired
    @Qualifier("webAuthorizationService.eservice2")
    private WebAuthorizationService webAuthorizationService;

    private Map<String,String> menuMapping;

    //before the actual handler will be executed
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (!webAuthorizationService.hasAuthorized())
            return true;

        if (applicationMenu == null){
            applicationMenu = menuService.buildMenuTree();
            menuMapping = menuService.getMenuMapping();
        }

        MenuItem funcMenu =  (MenuItem)request.getAttribute( FUNC_MENU_KEY );

        // Only execute once
        if (funcMenu == null){
            LoginUser loginUser = (LoginUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            funcMenu = userMenuService.getFunctionForUserRole(menuMapping, request, loginUser.getRoleCDs());
        }

        // Store for rendering
        request.setAttribute( FUNC_MENU_KEY, funcMenu );
        // applicationMenu store for other process use
        request.setAttribute( MENU_ROOT_KEY, applicationMenu );

        LOG.debug("funcMenu:" + funcMenu.toString());
        LOG.debug("applicationMenu:" + applicationMenu.toString());
        return true;
    }
}
