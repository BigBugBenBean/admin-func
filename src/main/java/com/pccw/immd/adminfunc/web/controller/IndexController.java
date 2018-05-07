package com.pccw.immd.adminfunc.web.controller;

import com.pccw.immd.adminfunc.dto.UpmsUser;
import com.pccw.immd.adminfunc.dto.UserDTO;
import com.pccw.immd.adminfunc.service.UpmsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;

@Controller
public class IndexController {

    public enum LOGIN_STATUS {
        LOGIN_SUCCESS,
        FIRST_LOGIN,
        INVALID_LOGIN_ID,
        INVALID_PASSWORD,
        EXPIRED
    }
	
	private static final Logger LOG = LoggerFactory.getLogger(IndexController.class);

    @GetMapping(value = "/index.html")
    public String indexPage(){
        return "index";
    }

    @RequestMapping(value = "/login-fail.do", method = RequestMethod.GET)
    public String loginFailPage() {
        return "/Auth/login-fail";
    }

    @Autowired
    @Qualifier("upmsService")
    private UpmsService upmsService;


    @GetMapping({"/landing.do"})
    public String submit(@ModelAttribute UserDTO userDTO, Principal principal)   {
        LOG.info("Calling landing ....... ");

        String loginId = principal.getName();
        LOG.info("loginId: " + loginId  );
        return "menu";
    }

    private String demoPage(String loginId, UserDTO userDTO) {
        LOGIN_STATUS status = validateAccount(loginId);
        LOG.info("validateAccount status: " + status);

        String errTitle = "";
        String errMsg = "";

        switch (status) {
            case LOGIN_SUCCESS: {
                return "menu";
            }
            case FIRST_LOGIN: {
                return "/Auth/change-pwd";
            }
            case EXPIRED: {
                errTitle = "Login Rejected";
                errMsg= "Your account has been locked after 180 days of inactivity. Please contact your supervisor to activate the account if necessary.";
                break;
            }
            case INVALID_LOGIN_ID:
            case INVALID_PASSWORD:
                errTitle = "Login Rejected";
                errMsg = "Invalid user ID or incorrect password";
                break;
            default: {
                break;
            }
        }

        userDTO.setErrorTitle(errTitle);
        userDTO.setErrorMessage(errMsg);

        return "/Auth/login-fail";
    }

    private LOGIN_STATUS validateAccount(String loginId) {
        switch (loginId) {
            case "demo001": {
                return LOGIN_STATUS.LOGIN_SUCCESS;
            }
            case "demo002": {
                return LOGIN_STATUS.FIRST_LOGIN;
            }
            case "demo003": {
                return LOGIN_STATUS.EXPIRED;
            }
            default: {
                return LOGIN_STATUS.INVALID_LOGIN_ID;
            }
        }
    }

}
