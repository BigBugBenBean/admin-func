package com.pccw.immd.adminfunc.web.security;

import com.pccw.immd.adminfunc.annotation.AccessAudit;
import com.pccw.immd.adminfunc.audit.AuditTrailSearchService;
import com.pccw.immd.adminfunc.dto.LoginUser;
import com.pccw.immd.adminfunc.mock.MockLoginUser;
import com.pccw.immd.adminfunc.service.UpmsService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutHandler;
import ws.upms.immd.v1.ITIAppException;
import ws.upms.immd.v1.ITISysException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Dell on 26/2/2018.
 */
public class AdminFuncLogoutHandler  implements LogoutHandler {
    protected final Log logger = LogFactory.getLog(this.getClass());

    @Autowired
    @Qualifier("upmsService")
    private UpmsService upmsService;

    @Autowired
    @Qualifier("auditTrailSearch")
    public AuditTrailSearchService auditTrailSearchService;

    public void logout(HttpServletRequest request, HttpServletResponse response, Authentication authentication) {
        logoutAccessAudit(request, response, authentication);
        try {
            if ( !(authentication.getPrincipal() instanceof MockLoginUser) ) {
                // Call enforce logout via SOAP endpoint
                logoutUpms(authentication);
            }
        } catch (ITIAppException | ITISysException ex) {
            if (logger.isDebugEnabled())
                logger.debug("UPMS logout occur exception:" + ex.getMessage());
        }

        request.getSession().invalidate();
        request.getSession(true);
    }

    private void logoutAccessAudit(HttpServletRequest request, HttpServletResponse response, Authentication authentication){
        String sessionId = request.getRequestedSessionId();
        LoginUser loginUser = (LoginUser) authentication.getPrincipal();
        AccessAudit.AccessActionType action = AccessAudit.AccessActionType.LOGOUT;
        String funcId = null;
        auditTrailSearchService.log(sessionId, loginUser, funcId, action);
    }

    private void logoutUpms(Authentication authentication) throws ITIAppException, ITISysException {
        LoginUser loginUser = (LoginUser) authentication.getPrincipal();
        upmsService.logout(loginUser.getUsername());
    }
}