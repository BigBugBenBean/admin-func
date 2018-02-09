package com.pccw.immd.adminfunc.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ws.upms.immd.v1.ITIAppException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import static com.pccw.immd.adminfunc.web.security.AdminFuncAuthenticationFailureHandler.SPRING_SECURITY_LAST_EXCEPTION;

@Controller
@RequestMapping(value = "/AUTH")
public class AuthController {

    private static final Logger LOG = LoggerFactory.getLogger(AuthController.class);

    @GetMapping(value = "/login-form.do")
    public String loginForm() {
        return "Auth/login-form";
    }


    @GetMapping("/login-fail.html")
    public String loginFail(HttpServletRequest request, HttpSession session) {
        LOG.info("login-fail ... ");
        String returnResult = "redirect:/AUTH/login_form.html";
        if (session.getAttribute(SPRING_SECURITY_LAST_EXCEPTION) != null) {
            if ( isPasswordExpired(session.getAttribute(SPRING_SECURITY_LAST_EXCEPTION)) ){
                returnResult = "redirect:/changePassword.do";
            } else {
                // General Error will goto error page.
                request.setAttribute(SPRING_SECURITY_LAST_EXCEPTION, session.getAttribute(SPRING_SECURITY_LAST_EXCEPTION));
                returnResult = "auth/login-fail";
            }
            request.setAttribute("hasError", true);
            session.removeAttribute(SPRING_SECURITY_LAST_EXCEPTION);
            return returnResult;
        }
        return returnResult;
    }

    private static String LDAPI1120 = "LDAPI1120";

    private boolean isPasswordExpired(Object attribute) {
        if (attribute !=null && attribute instanceof Exception  ){
            Exception ex = (Exception)attribute;
            if (ex.getCause() instanceof ITIAppException){
                ITIAppException appEx = (ITIAppException)ex.getCause();
                String errCode = appEx.getFaultInfo().getErrCode();
                if (errCode.equals(LDAPI1120))
                    return true;
            }
        }
        return false;
    }

    @RequestMapping(value = "/{module}/module.html", method = RequestMethod.GET)
    public String modulePage(
            @PathVariable("page") String page,
            @PathVariable("module") String module) {
        LOG.debug("module = " + module);
        return "module";
    }
}
