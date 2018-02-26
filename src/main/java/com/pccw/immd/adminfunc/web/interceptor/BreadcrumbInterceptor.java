package com.pccw.immd.adminfunc.web.interceptor;


import com.pccw.immd.adminfunc.service.MenuService;
import com.pccw.immd.adminfunc.service.NavigationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

import static com.pccw.immd.adminfunc.web.interceptor.MenuInterceptor.MENU_ROOT_KEY;


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
    private static final String BREADCRUMB_NAV_KEY = "NAVBAR";

    @Autowired
    @Qualifier("navigationService.eservice2")
    NavigationService navigationService;

//    @Autowired
//    @Qualifier("menuService.eservice2")
//    MenuService.MenuItem menuItem;

    //before the actual handler will be executed
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
        throws Exception {

        LOG.info("-----------------------BreadcrumbInterceptor_preHandle---------------------------------");

        MenuService.MenuItem root = (MenuService.MenuItem)request.getAttribute(MENU_ROOT_KEY);
//        LOG.info("root: " + root);


        String requestLink = convertLink(request.getRequestURI().toString(), request.getContextPath());



//        String url = request.getRequestURL().toString();
        List<String> navList = navigationService.generateNavigationBar(requestLink, root);
        LOG.info(  "req: " + navList    );

        LOG.info("");

        request.setAttribute( BREADCRUMB_NAV_KEY, navigationService );
        return true;
    }

    private String convertLink(String uri, String contextPath) {
//        LOG.info("uri: " + uri + " , contextPath: " + contextPath);

        String link = uri.replace(contextPath, "");


        return link;
    }

    //after the handler is executed
    public void postHandle(
        HttpServletRequest request, HttpServletResponse response, 
        Object handler, ModelAndView modelAndView)
        throws Exception {
    }


}
