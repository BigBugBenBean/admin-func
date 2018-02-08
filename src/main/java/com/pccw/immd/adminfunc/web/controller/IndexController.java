package com.pccw.immd.adminfunc.web.controller;

import com.pccw.immd.adminfunc.dto.LoginUser;
import com.pccw.immd.adminfunc.dto.UpmsUser;
import com.pccw.immd.adminfunc.dto.UserDTO;
import com.pccw.immd.adminfunc.service.UpmsService;
import com.pccw.immd.adminfunc.ws.upms.cxf.ITIAppException;
import com.pccw.immd.adminfunc.ws.upms.cxf.ITISysException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

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

//    @RequestMapping(value = "/login.html", method = RequestMethod.GET)
//    public String loginPage() {
//        return "/Auth/login";
//    }

    @GetMapping("/login")
    public String backToLogin() {
        LOG.info("Calling backToLogin ....... ");
        return "/auth/login_form";
    }

    @RequestMapping(value = "/login-fail.do", method = RequestMethod.GET)
    public String loginFailPage() {
        return "/Auth/login-fail";
    }

    @Autowired
    @Qualifier("upmsService")
    private UpmsService upmsService;


    @GetMapping("/landing")
    public String submit(@ModelAttribute UserDTO userDTO, Principal principal)   {
        LOG.info("Calling login ....... ");

        String loginId = principal.getName();
        LOG.info("loginID: " + loginId  );

        String termialId = "";

        String demoPrefix = "demo";

        if (loginId.contains(demoPrefix)) {



            String errTitle = "";
            String errMsg = "";


            LOGIN_STATUS status = validateAccount(loginId);
            LOG.info("validateAccount status: " + status);
            switch (status) {
                case LOGIN_SUCCESS: {
                    return "menu";
                }
                case FIRST_LOGIN: {
                    return "/auth/change-pwd";
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

            return "/auth/login-fail";
        }


//        return "/Auth/login-fail";
//        return "result";
//        return "/Auth/login";
        return "menu";
    }


    private LOGIN_STATUS validateAccount(String loginId) {


        String okPwd = "password";

//        if (loginId.equals("demo001")) {
//
//        } else if (loginId.equals("demo002")) {
//
//        }

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

//        return LOGIN_STATUS.INVALID_LOGIN_ID;
    }

}
