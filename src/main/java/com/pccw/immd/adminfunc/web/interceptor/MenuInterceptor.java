package com.pccw.immd.adminfunc.web.interceptor;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** 
 ** 
 **  File Name   : PermissionInterceptor.java
 **  Create Date : 7 Feb 2018
 **  Author      : Dell
 **
 */
public class MenuInterceptor extends HandlerInterceptorAdapter {
    
    private static final Logger LOG = LoggerFactory.getLogger(MenuInterceptor.class);

    //before the actual handler will be executed
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
        throws Exception {

        long startTime = System.currentTimeMillis();
        request.setAttribute("MenuInterceptor ... startTime", startTime);

        return true;
    }

    //after the handler is executed
    public void postHandle(
        HttpServletRequest request, HttpServletResponse response, 
        Object handler, ModelAndView modelAndView)
        throws Exception {
        
        long startTime = (Long)request.getAttribute("startTime");
        
        long endTime = System.currentTimeMillis();

        long executeTime = endTime - startTime;
        
        //modified the exisitng modelAndView
        if (modelAndView != null)
            modelAndView.addObject("executeTime",executeTime);
        
        //log it
        if(LOG.isDebugEnabled()){
            LOG.debug("[" + handler + "] executeTime : " + executeTime + "ms");
            LOG.debug("MenuInterceptor ... ");
        }

        MenuItem root = new MenuItem("ROOT","ROOT");
        root.addAllMenu(getService2SubMenu());

        modelAndView.addObject("ROOT", root);
    }

    private List<MenuItem> getService2SubMenu() {
        List<MenuItem> menu = new ArrayList<>();
//        MenuItem enquiry        = new MenuItem("Enquiry",       "/ESERVICE2/enquiry/menu.do");
//        MenuItem maintenance    = new MenuItem("Maintenance",   "/ESERVICE2/maintenance/menu.do");
//        MenuItem management     = new MenuItem("Management",    "/ESERVICE2/management/menu.do");
//        menu.add(enquiry);
//        menu.add(maintenance);
//        menu.add(management);
//
//        MenuItem applicationFeeEnquiry  = new MenuItem("Enquiry", "/ESERVICE2/enquiry/applicationFeeEnquiry.do");
//        enquiry.addMenu(applicationFeeEnquiry);
//
//        MenuItem systemHolidayView      = new MenuItem("Enquiry", "/ESERVICE2/enquiry/systemHolidayView.do");
//        enquiry.addMenu(systemHolidayView);

        MenuItem eServices2        = new MenuItem("e-Services-2",       "/ESERVICE2/enquiry/menu.do");
        MenuItem smartics2    = new MenuItem("SMARTICS-2",   "/ESERVICE2/maintenance/menu.do");
        MenuItem rm     = new MenuItem("RM",    "/ESERVICE2/management/menu.do");

        menu.add(eServices2);
        menu.add(smartics2);
        menu.add(rm);
        return menu;
    }

    class MenuItem{
        private String label;
        private String url;
        private List<MenuItem> childern = new ArrayList<>();

        public MenuItem(String label, String url) {
            this.label = label;
            this.url = url;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public List<MenuItem> getChildern() {
            return childern;
        }

        public void addMenu(MenuItem menuItem) {
            this.childern.add(menuItem);
        }

        public void addAllMenu(List<MenuItem> childern) {
            this.childern.addAll(childern);
        }
    }
}
