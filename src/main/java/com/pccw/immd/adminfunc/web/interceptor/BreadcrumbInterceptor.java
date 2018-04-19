package com.pccw.immd.adminfunc.web.interceptor;

import static com.pccw.immd.adminfunc.service.MenuService.MenuItem;

import com.pccw.immd.adminfunc.service.MenuService;
import com.pccw.immd.adminfunc.service.NavigationService;
import com.pccw.immd.adminfunc.web.security.WebAuthorizationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

import static com.pccw.immd.adminfunc.service.MenuService.MENU_ROOT_KEY;

/**
 ** 
 **  File Name   : BreadcrumbInterceptor.java
 **  Create Date : 7 Feb 2018
 **  Author      : Dell
 **
 */
public class BreadcrumbInterceptor extends HandlerInterceptorAdapter {
    
    private static final Logger LOG = LoggerFactory.getLogger(BreadcrumbInterceptor.class);
    private static final String BREADCRUMB_NAV_KEY = "NAVBAR";
    public static final String FUNC_ID_KEY = "FUNC_ID";

    public enum FUNC_ID {
        Access_Control("EC01"),
        Application_Fee_Enquiry("EC02"),
        Audit_Log("EC03"),
        Change_Password("EC04"),
        Create_Function_Group("EC05"),
        Delete_Function_Group("EC06"),
        Important_Announcement("EC07"),
        Surge_Control("EC08"),
        Update_Function_Group("EC09"),
        System_Holiday("EC10"),
        Schedule_Job_Create_Job("EC11"),
        Schedule_Job_Update_Job("EC12"),
        Schedule_Job_Delete_Job("EC13"),
        Schedule_Job_View_Job("EC14"),
        Schedule_Job_View_Job_History("EC15"),
        RM_Online_Submission_Enquiry("RM01"),
        Appointment_Booking_Enquiry("SM01"),
        Delete_Appointment("SM02"),
        Enquiry_Code_Information("SM03"),
        SM_Online_Submission_Enquiry("SM04"),
        ;

        private String code;
        FUNC_ID(String code) {
            this.code = code;
        }

        public String toString() {
            return this.code;
        }

    };

    @Autowired
    @Qualifier("navigationService.eservice2")
    NavigationService navigationService;

    @Autowired
    @Qualifier("webAuthorizationService.eservice2")
    private WebAuthorizationService webAuthorizationService;

    //before the actual handler will be executed
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
        throws Exception {

        if (!webAuthorizationService.hasAuthorized())
            return true;

        String context = request.getContextPath();
        String uri = request.getRequestURI().replace(context, "");

        MenuItem root = (MenuService.MenuItem)request.getAttribute(MENU_ROOT_KEY);
        List<MenuItem> navItems = navigationService.generateNavigationBar(uri, root);

        if (navItems != null && navItems.size()> 0) {
            request.getSession().setAttribute(BREADCRUMB_NAV_KEY, navItems);
        } else {
            navItems = (List<MenuItem>) request.getSession().getAttribute(BREADCRUMB_NAV_KEY);
        }

        request.setAttribute( BREADCRUMB_NAV_KEY, navItems );
        LOG.info("navItems:" + navItems);

        return true;
    }
}
