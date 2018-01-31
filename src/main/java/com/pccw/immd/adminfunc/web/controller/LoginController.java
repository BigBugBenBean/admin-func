package com.pccw.immd.adminfunc.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.validation.Valid;

import com.pccw.immd.adminfunc.service.AppointmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pccw.immd.adminfunc.dto.UpmsUser;
import com.pccw.immd.adminfunc.dto.UserDTO;
import com.pccw.immd.adminfunc.dto.UserDTO3;
import com.pccw.immd.adminfunc.service.UpmsService;
import com.pccw.immd.adminfunc.web.rest.AuthApi;
import com.pccw.immd.adminfunc.ws.upms.cxf.ITIAppException;
import com.pccw.immd.adminfunc.ws.upms.cxf.ITISysException;

import io.swagger.annotations.ApiParam;

@Controller
public class LoginController {

    private static final Logger LOG = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(value = "/login.html", method = RequestMethod.GET)
    public String loginPage() {
        return "/Auth/login";
    }

//    @RequestMapping( value = "/{module}/module.html", method = RequestMethod.POST)
//    public String handleLogin(
////            @PathVariable("username") String username,
////            @PathVariable("password") String password
//            @PathVariable("password") String password
//    ) {
//        LOG.debug("username: " + username + " , password: " + password);
//        if ()
//        return "";
//    }

    @RequestMapping(value = "/login-fail.html", method = RequestMethod.GET)
    public String loginFailPage() {
        return "/Auth/login-fail";
    }

    @Autowired
    @Qualifier ("upmsService")
    private UpmsService upmsService;


    @PostMapping("/result.html")
    public String submit(@ModelAttribute UserDTO userDTO)   {
        LOG.info("Calling login ....... ");
        LOG.info("loginID: " + userDTO.getLoginId() + " , password: " + userDTO.getPassword() );

        String termialId = "";

        try {
            if (false) {
                UpmsUser user = upmsService.login(userDTO.getLoginId(), userDTO.getPassword(), termialId);
            }


        } catch (ITIAppException|ITISysException e) {

            userDTO.setErrorTitle("Login Rejected");
            userDTO.setErrorMessage(e.getMessage());

            return "/Auth/login-fail";
        }
        return "/Auth/login-fail";
//        return "result";
    }

//    @RequestMapping( value = "/result.html", method = RequestMethod.POST)
//    @ModelAttribute
//    public String submit(@Valid UserDTO userDTO
////            @ApiParam(value = "" ,required=true )
////            BindingResult result,
////            ModelMap model
////            @Valid @RequestParam("loginId") String loginId,
////            @Valid @RequestParam("password") String password,
////            @ModelAttribute("subm")
////                @RequestBody  @Valid UserDTO userDTO
//    )
//    {
//        LOG.info("Calling login ... ");
////        String userId = "A5";
////        String password = "{sha256}+svXlT+p7mThxXc46ulsXzLEFbNwER3is8+mtZsjrQA=";
////        userId = "SCUSER08";
////        password =        "{sha256}XohImNooBHFR0OVvjcYpJ3NgPQ1qq73WKhHvch0VQtg=";
//        String termialId = "";
////        UpmsUser user = upmsService.login(userDTO.getLoginId(), userDTO.getPassword(), termialId);
////        return user;
//        return "login-fail";
//    }

//    @RequestMapping(value="/processForm",params="action1",method=RequestMethod.POST)
//    public void action1()
//    {
//        System.out.println("Action1 block called");
//    }
}
