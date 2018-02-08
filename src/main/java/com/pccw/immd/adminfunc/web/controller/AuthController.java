package com.pccw.immd.adminfunc.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import static com.pccw.immd.adminfunc.web.security.AdminFuncAuthenticationFailureHandler.SPRING_SECURITY_LAST_EXCEPTION;

@Controller
@RequestMapping(value = "/AUTH")
public class AuthController {

    private static final Logger LOG = LoggerFactory.getLogger(AuthController.class);

    @GetMapping(value = "/login_form.html")
    public String loginForm() {
        return "auth/login_form";
    }

    @GetMapping("/login-fail.html")
    public String loginFail(HttpServletRequest request, HttpSession session) {
        LOG.info("login-fail ... ");
        if (session.getAttribute(SPRING_SECURITY_LAST_EXCEPTION) != null) {
            request.setAttribute("hasError", true);
            request.setAttribute(SPRING_SECURITY_LAST_EXCEPTION, session.getAttribute(SPRING_SECURITY_LAST_EXCEPTION));
            session.removeAttribute(SPRING_SECURITY_LAST_EXCEPTION);
            return "auth/login-fail";
        }
        return "redirect:/AUTH/login_form.html";
    }

    @RequestMapping(value = "/{module}/module.html", method = RequestMethod.GET)
    public String modulePage(
            @PathVariable("page") String page,
            @PathVariable("module") String module) {
        LOG.debug("module = " + module);
        return "module";
    }
}
