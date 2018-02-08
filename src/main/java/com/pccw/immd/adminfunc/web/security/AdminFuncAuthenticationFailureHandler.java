package com.pccw.immd.adminfunc.web.security;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.ExceptionMappingAuthenticationFailureHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Dell on 30/1/2018.
 */
public class AdminFuncAuthenticationFailureHandler extends ExceptionMappingAuthenticationFailureHandler {

    public static String SPRING_SECURITY_LAST_EXCEPTION = "SPRING_SECURITY_LAST_EXCEPTION";

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        request.setAttribute("EXCEPTION_MESSAGE", exception.getMessage());
        request.getSession().setAttribute(SPRING_SECURITY_LAST_EXCEPTION, exception);
        super.onAuthenticationFailure(request, response, exception);

    }
}