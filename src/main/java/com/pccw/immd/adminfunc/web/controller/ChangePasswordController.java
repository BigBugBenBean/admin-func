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
import com.pccw.immd.adminfunc.dto.PasswordDTO;
import com.pccw.immd.adminfunc.service.UpmsService;
import com.pccw.immd.adminfunc.web.rest.AuthApi;
import com.pccw.immd.adminfunc.ws.upms.cxf.ITIAppException;
import com.pccw.immd.adminfunc.ws.upms.cxf.ITISysException;

import io.swagger.annotations.ApiParam;

@Controller
public class ChangePasswordController {

    private static final Logger LOG = LoggerFactory.getLogger(ChangePasswordController.class);

    @RequestMapping(value = "/changePassword.html", method = RequestMethod.GET)
    public String changePwdPage() {
        return "/Auth/change-pwd";
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

//     @Autowired
//     @Qualifier ("upmsService")
//     private UpmsService upmsService;


     @PostMapping("/changePassword")
     public String submit(@ModelAttribute PasswordDTO passwordDTO) {
         LOG.info("Calling changePassword ....... ");

         String oldPassword = passwordDTO.getOldPassword();
         String newPassword = passwordDTO.getNewPassword();
         String confirmNewPassword = passwordDTO.getConfirmNewPassword();

         LOG.info("oldPassword: " + oldPassword + " , newPassword: " + newPassword + " , confirmNewPassword: " + confirmNewPassword );

         String errMsg = "";
         if (oldPassword.equals("")) {
             errMsg = "Please input Old Password.";

             passwordDTO.setErrorCode(100);
             passwordDTO.setErrorMessage(errMsg);

             return "/Auth/change-pwd";
         }
         if (newPassword.equals("")) {
             errMsg = "Please input New Password.";

             passwordDTO.setErrorCode(101);
             passwordDTO.setErrorMessage(errMsg);

             return "/Auth/change-pwd";
         }
         if (confirmNewPassword.equals("")) {
             errMsg = "Please input Confirm New Password.";

             passwordDTO.setErrorCode(102);
             passwordDTO.setErrorMessage(errMsg);

             return "/Auth/change-pwd";
         }

         if (newPassword.length() < 6) {
             errMsg = "The new password should contain at least 6 characters.";

             passwordDTO.setErrorCode(103);
             passwordDTO.setErrorMessage(errMsg);

             return "/Auth/change-pwd";
         }

         if (!newPassword.equals(confirmNewPassword)) {
             errMsg = "The new password are not the same.";

             passwordDTO.setErrorCode(104);
             passwordDTO.setErrorMessage(errMsg);

             return "/Auth/change-pwd";
         }



//         String termialId = "";

//         try {
//             UpmsUser user = upmsService.login(userDTO.getLoginId(), userDTO.getPassword(), termialId);
//         } catch (ITIAppException|ITISysException e) {

//             userDTO.setErrorTitle("Login Rejected");
//             userDTO.setErrorMessage(e.getMessage());

//             return "login-fail";
//         }
//         return "login-fail";
// //        return "result";

         return "/Auth/change-pwd";
     }



}
