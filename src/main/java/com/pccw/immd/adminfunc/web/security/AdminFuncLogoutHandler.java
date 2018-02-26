package com.pccw.immd.adminfunc.web.security;

import com.pccw.immd.adminfunc.annotation.AccessAudit;
import com.pccw.immd.adminfunc.audit.AccessAuditService;
import com.pccw.immd.adminfunc.dto.LoginUser;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Dell on 26/2/2018.
 */
public class AdminFuncLogoutHandler  implements LogoutHandler {
    protected final Log logger = LogFactory.getLog(this.getClass());

    @Autowired
    @Qualifier("accessAuditService")
    public AccessAuditService accessAuditService;

    public void logout(HttpServletRequest request, HttpServletResponse response, Authentication authentication) {
        logoutAccessAudit(request, response, authentication);
    }

    private void logoutAccessAudit(HttpServletRequest request, HttpServletResponse response, Authentication authentication){
        String sessionId = request.getRequestedSessionId();
        LoginUser loginUser = (LoginUser) authentication.getPrincipal();
        AccessAudit.AccessActionType action = AccessAudit.AccessActionType.LOGOUT;
        String funcId = null;

        accessAuditService.log(sessionId, loginUser, funcId, action);
    }
}