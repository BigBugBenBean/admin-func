package com.pccw.immd.adminfunc.web.security;

import com.pccw.immd.adminfunc.annotation.AccessAudit;
import com.pccw.immd.adminfunc.audit.AccessAuditService;
import com.pccw.immd.adminfunc.dto.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.web.authentication.ExceptionMappingAuthenticationFailureHandler;
import util.itifwk.immd.v1.ITIAppException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Dell on 30/1/2018.
 */
public class AdminFuncAuthenticationFailureHandler extends ExceptionMappingAuthenticationFailureHandler {

    public static String SPRING_SECURITY_LAST_EXCEPTION = "SPRING_SECURITY_LAST_EXCEPTION";

    @Autowired
    @Qualifier("accessAuditService")
    public AccessAuditService accessAuditService;

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        logFailAccessAudit(request, response, exception);
        request.setAttribute("EXCEPTION_MESSAGE", exception.getMessage());
        request.getSession().setAttribute(SPRING_SECURITY_LAST_EXCEPTION, exception);
        super.onAuthenticationFailure(request, response, exception);

    }

    private void logFailAccessAudit(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception){
        ITIAppException appEx = ExceptionUtils.getUmpsException(exception);
        String loginId = null;
        if (appEx != null) {
            loginId = appEx.getLoginId();
        }
        String sessionId = request.getRequestedSessionId();
        LoginUser loginUser = new LoginUser(loginId, "", new ArrayList<SimpleGrantedAuthority>());
        AccessAudit.AccessActionType action = AccessAudit.AccessActionType.LOGIN_FAIL;
        String funcId = null;

        accessAuditService.log(sessionId, loginUser, funcId, action);
    }
}