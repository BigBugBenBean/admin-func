package com.pccw.immd.adminfunc.web.interceptor;

import com.pccw.immd.adminfunc.dto.LoginUser;
import com.pccw.immd.adminfunc.service.UpmsEndPointServiceWithHeader;
import com.pccw.immd.adminfunc.service.UserMenuService;
import com.pccw.immd.adminfunc.web.security.ExceptionUtils;
import com.pccw.immd.adminfunc.web.security.WebAuthorizationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import ws.upms.immd.v1.ITIAppException;
import ws.upms.immd.v1.ITISysException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceException;
import java.io.IOException;
import java.util.List;

import static com.pccw.immd.adminfunc.service.MenuService.FUNC_LIST;
import static com.pccw.immd.adminfunc.service.MenuService.MENU_ROOT_KEY;

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

    @Autowired
    @Qualifier("webAuthorizationService.eservice2")
    private WebAuthorizationService webAuthorizationService;


    @Value("${web.loginmode.byrole:false}")
    private boolean roleLoginMode;

    @Value("${web.loginmode.demouser:false}")
    private boolean demoUserMode;

    //before the actual handler will be executed
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
        throws Exception {
        if (!webAuthorizationService.hasAuthorized())
            return true;

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

        if(  resolveMenuAccessRight(request, response) )
            return true;
        else
            return false;
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

            // for development
            if( ! (roleLoginMode && demoUserMode) ) {
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
    private boolean resolveMenuAccessRight(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<String> funcs = (List<String>)request.getSession().getAttribute( MENU_ROOT_KEY );
        if ( funcs != null && !funcs.contains(request.getRequestURI())) {
            Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            String userId = SecurityContextHolder.getContext().getAuthentication().getName();

            if (demoUserMode && isDemoAccount(userId)) {
                LOG.info("SKIP Resolve functions.");
                return true;
            }

            if (principal instanceof LoginUser) {
                List<String> funcList = (List<String>) request.getSession().getAttribute(FUNC_LIST);
                if (funcList.contains(request.getRequestURI())){
                    response.sendRedirect(request.getContextPath() +"/AUTH/no-permission.do");
                    return false;
                }
            }
        }
        return true;
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
