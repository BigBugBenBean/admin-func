package com.pccw.immd.adminfunc.web.interceptor;

import com.pccw.immd.adminfunc.domain.Func;
import com.pccw.immd.adminfunc.dto.LoginUser;
import com.pccw.immd.adminfunc.service.MenuService;
import com.pccw.immd.adminfunc.service.UserMenuService;
import com.pccw.immd.adminfunc.service.impl.UserMenuServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
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
    public static final String MENU_ROOT_KEY = "ROOT";
    public static final String FUNC_MENU_KEY = "MENU";
    public final static String FUNC_LIST = "FUNC_LIST";


    private MenuService.MenuItem applicationMenu;
    private MenuService.MenuItem funcMenu;

    @Autowired
    @Qualifier("menuService.eservices2")
    MenuService menuService;

    @Autowired
    @Qualifier("userMenuService")
    private UserMenuService userMenuService;


    //before the actual handler will be executed
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {


        if (applicationMenu == null){
            applicationMenu = menuService.buildMenuTree();
        }

        // TODO: dummy data only, need to get the list from DB depends on UM_GROUP's function list
        if (funcMenu == null) {
            Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            if ( !(principal instanceof  String && ((String )principal).equals("anonymousUser"))) {
                LoginUser loginUser = (LoginUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//            LoginUser loginUser1 = new LoginUser();
                funcMenu = userMenuService.getFunctionForUserRole(applicationMenu, request, loginUser.getRoleCDs());
            }
        }

        request.setAttribute( FUNC_MENU_KEY, funcMenu );
        request.setAttribute( MENU_ROOT_KEY, applicationMenu );
        return true;
    }
}
