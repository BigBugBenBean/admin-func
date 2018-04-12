package com.pccw.immd.adminfunc.web.interceptor;

import com.pccw.immd.adminfunc.service.MenuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

    private MenuService.MenuItem applicationMenu;
    private MenuService.MenuItem funcMenu;

    @Autowired
    @Qualifier("menuService.eservices2")
    MenuService menuService;

    //before the actual handler will be executed
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (applicationMenu == null){
            applicationMenu = menuService.buildMenuTree();
        }

        // TODO: dummy data only, need to get the list from DB depends on UM_GROUP's function list
        if (funcMenu == null) {
            funcMenu = menuService.buildMenuTree();
            if (funcMenu.getChild().size() > 2) {
                funcMenu.getChild().get(0).getChild().get(0).getChild().remove(0);
                funcMenu.getChild().get(0).getChild().get(0).getChild().remove(0);

                funcMenu.getChild().get(0).getChild().get(1).getChild().remove(0);
                funcMenu.getChild().get(0).getChild().get(1).getChild().remove(0);
                funcMenu.getChild().get(0).getChild().get(1).getChild().remove(0);

                funcMenu.getChild().get(0).getChild().get(2).getChild().remove(0);
                funcMenu.getChild().get(0).getChild().get(2).getChild().remove(0);

                funcMenu.getChild().get(0).getChild().get(1).getChild().clear();

            }
        }


        request.setAttribute( FUNC_MENU_KEY, funcMenu );
        request.setAttribute( MENU_ROOT_KEY, applicationMenu );
        return true;
    }

}
