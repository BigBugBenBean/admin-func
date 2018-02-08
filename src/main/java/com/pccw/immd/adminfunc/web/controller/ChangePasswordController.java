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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public enum CHANGE_PWD_STATUS {
        CHANGE_PWD_SUCCESS,
        OLD_PWD_EMPTY,
        NEW_PWD_EMPTY,
        CONFIRM_NEW_PWD_EMPTY,
        AT_LEAST_6_CHARACTERS,
        PWD_SHOULD_CONTAIN_NUM_AND_ALPHABET,
        NEW_PWD_NOT_SAME_AS_CONFIRM_NEW_PWD,
        NEW_PWD_SAME_AS_OLD_PWD,
        OLD_PWD_INCORRECT
    }

    private static final Logger LOG = LoggerFactory.getLogger(ChangePasswordController.class);

    @RequestMapping(value = "/changePassword.do", method = RequestMethod.GET)
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

         CHANGE_PWD_STATUS status = validateChangePassword(oldPassword, newPassword, confirmNewPassword);

         Integer errCode = passwordDTO.getErrorCode();
         String errTitle = "";
         String errMsg = "";



         switch (status) {
             case CHANGE_PWD_SUCCESS: {
                break;
             }
             case OLD_PWD_EMPTY: {
                 errCode = 1001;
                 errMsg = "Please input Old Password.";
                 break;
             }
             case NEW_PWD_EMPTY: {
                 errCode = 1001;
                 errMsg = "Please input New Password.";
                 break;
             }
             case CONFIRM_NEW_PWD_EMPTY: {
                 errCode = 1001;
                 errMsg = "Please input Confirm New Password.";
                 break;
             }
             case AT_LEAST_6_CHARACTERS: {
                 errCode = 1001;
                 errMsg = "The new password should contain at least 6 characters";
                 break;
             }
             case PWD_SHOULD_CONTAIN_NUM_AND_ALPHABET: {
                 errCode = 1001;
                 errMsg = "The new password should contain both numeral and alphabet.";
                 break;
             }
             case NEW_PWD_NOT_SAME_AS_CONFIRM_NEW_PWD: {
                 errCode = 1001;
                 errMsg = "Thew new passwords are not the same.";
                 break;
             }
             case NEW_PWD_SAME_AS_OLD_PWD: {
                 errCode = 1001;
                 errMsg = "The new password should not be same as your last password.";
                 break;
             }
             case OLD_PWD_INCORRECT: {
                 errCode = 1002;
                 errMsg = "Your password cannot be updated due to the following reason: \n\n";
                 break;
             }
             default: {
                 break;
             }
         }

         LOG.info("errCode: " + errCode);

         passwordDTO.setErrorCode(errCode);
         passwordDTO.setErrorMessage(errMsg);

         if (errCode == -1) {
             // success
             return "redirect:/AUTH/login_form.html";
         } else if (errCode == 1001) {

             return "/auth/change-pwd";
         } else if (errCode == 1002) {

             return "/auth/change-pwd-fail";
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


     private CHANGE_PWD_STATUS validateChangePassword(String oldPwd, String newPwd, String confirmNewPwd) {

        // old password empty
        if (oldPwd.equals("")) {
            return CHANGE_PWD_STATUS.OLD_PWD_EMPTY;
        }

        // new password empty
        if (newPwd.equals("")) {
            return CHANGE_PWD_STATUS.NEW_PWD_EMPTY;
        }

        // confirm new password empty
        if (confirmNewPwd.equals("")) {
            return CHANGE_PWD_STATUS.CONFIRM_NEW_PWD_EMPTY;
        }

        // new password not same as confirm new password
        if (!newPwd.equals(confirmNewPwd)) {
            return CHANGE_PWD_STATUS.NEW_PWD_NOT_SAME_AS_CONFIRM_NEW_PWD;
        }

        // at least 6 characters
        if (newPwd.length() < 6) {
            return CHANGE_PWD_STATUS.AT_LEAST_6_CHARACTERS;
        }

        // new password same as old password
        if (oldPwd.equals(newPwd)) {
            return CHANGE_PWD_STATUS.NEW_PWD_SAME_AS_OLD_PWD;
        }

        // should contain numeric and alphabet
//        String keyword = newPwd;
//        String regex = "^[a-zA-Z0-9]*$";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(keyword);
//        if (!matcher.find()) {
//            return CHANGE_PWD_STATUS.PWD_SHOULD_CONTAIN_NUM_AND_ALPHABET;
//        }
//        if (!isAlphaAndNumeric(newPwd)) {
//            return CHANGE_PWD_STATUS.PWD_SHOULD_CONTAIN_NUM_AND_ALPHABET;
//        }
         boolean isAlpha = isAlphabet(newPwd);
         boolean isNum = isNumeric(newPwd);

         if (!(isAlpha && isNum)) {
             return CHANGE_PWD_STATUS.PWD_SHOULD_CONTAIN_NUM_AND_ALPHABET;
         }

//         return CHANGE_PWD_STATUS.NEW_PWD_SAME_AS_OLD_PWD;
//        return CHANGE_PWD_STATUS.OLD_PWD_INCORRECT;
        return CHANGE_PWD_STATUS.CHANGE_PWD_SUCCESS;
     }

     private boolean isAlphabet(String keyword) {
        String regex = ".*[A-Za-z].*";

        boolean isMatch = keyword.matches(regex);
        LOG.info("isAlpha keyword: " + keyword + " , isMatch: " + isMatch);
        return isMatch;
     }

    private boolean isNumeric(String keyword) {
        String regex = ".*[0-9].*";

        boolean isMatch = keyword.matches(regex);
        LOG.info("isNumeric keyword: " + keyword + " , isMatch: " + isMatch);
        return isMatch;
    }

}
