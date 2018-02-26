package com.pccw.immd.adminfunc.web.controller;

import com.pccw.immd.adminfunc.dto.PasswordDTO;
import com.pccw.immd.adminfunc.web.security.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import util.itifwk.immd.v1.ITIAppException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.security.Principal;

import static com.pccw.immd.adminfunc.web.security.AdminFuncAuthenticationFailureHandler.SPRING_SECURITY_LAST_EXCEPTION;

@Controller
@RequestMapping(value = "/AUTH")
public class AuthController {

    private static final Logger LOG = LoggerFactory.getLogger(AuthController.class);

    private static String PASSWORD_EXPIRED = "LDAPI1120";

    @GetMapping(value = "/login-form.do")
    public String loginForm(HttpSession seesion, Principal principal) {
        if (seesion.isNew())
            return "redirect:/AUTH/login_form.do";
        return "Auth/login-form";
    }

    @GetMapping(value = "/no-permission.do")
    public String noPermission() {
        return "Auth/no-permission";
    }

    @RequestMapping(value = "/logout-result.do", method = RequestMethod.GET)
    public String logoutResult() {
        return "/Auth/logout-success";
    }


    @GetMapping("/login-fail.do")
    public String loginFail(@ModelAttribute PasswordDTO passwordDTO, HttpServletRequest request, HttpSession session) {
        LOG.info("login-fail ... ");
        String returnResult = "redirect:/AUTH/login_form.do";
        request.setAttribute(SPRING_SECURITY_LAST_EXCEPTION, session.getAttribute(SPRING_SECURITY_LAST_EXCEPTION));
        if (session.getAttribute(SPRING_SECURITY_LAST_EXCEPTION) != null) {
            if (isPasswordExpired(session.getAttribute(SPRING_SECURITY_LAST_EXCEPTION))) {
                String loginId = getLoginId(session.getAttribute(SPRING_SECURITY_LAST_EXCEPTION));
                LOG.info("Password expired, loginId: " + loginId);
                passwordDTO.setLoginId(loginId);
//                returnResult = "redirect:/changePassword.do";
                returnResult = "auth/change-pwd";
            } else {
                // General Error will goto error page.
                returnResult = "auth/login-fail";
            }
            request.setAttribute("hasError", true);
            session.removeAttribute(SPRING_SECURITY_LAST_EXCEPTION);
            return returnResult;
        }
        return returnResult;
    }

    private String getLoginId(Object exception) {
        ITIAppException appEx = ExceptionUtils.getUmpsException(exception);
        if (appEx != null) {
            return appEx.getLoginId();
        }
        return null;
    }

    private boolean isPasswordExpired(Object exception) {
        ITIAppException appEx = ExceptionUtils.getUmpsException(exception);
        if (appEx != null) {
            String errCode = appEx.getErrCode();
            if (errCode.equals(PASSWORD_EXPIRED))
                return true;
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
