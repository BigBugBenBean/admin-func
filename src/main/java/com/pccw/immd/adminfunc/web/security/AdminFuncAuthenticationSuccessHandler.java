package com.pccw.immd.adminfunc.web.security;


import com.pccw.immd.adminfunc.annotation.AccessAudit;
import com.pccw.immd.adminfunc.audit.AuditTrailSearchService;
import com.pccw.immd.adminfunc.dto.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Dell on 26/2/2018.
 */
public class AdminFuncAuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

    @Autowired
    @Qualifier("auditTrailSearch")
    public AuditTrailSearchService auditTrailSearchService;

    public AdminFuncAuthenticationSuccessHandler() {

    }

    public AdminFuncAuthenticationSuccessHandler(String defaultTargetUrl) {
        super(defaultTargetUrl);
    }

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        logSuccessAccessAudit(request, response, authentication);
        super.onAuthenticationSuccess(request, response,authentication);
    }

    private void logSuccessAccessAudit(HttpServletRequest request, HttpServletResponse response, Authentication authentication){
        String sessionId = request.getRequestedSessionId();
        LoginUser loginUser = (LoginUser) authentication.getPrincipal();
        AccessAudit.AccessActionType action = AccessAudit.AccessActionType.LOGIN_SUCCESS;
        String funcId = null;

        auditTrailSearchService.log(sessionId, loginUser, funcId, action);
    }
}