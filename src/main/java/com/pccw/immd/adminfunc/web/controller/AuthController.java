package com.pccw.immd.adminfunc.web.controller;

import com.pccw.immd.adminfunc.dto.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/AUTH")
public class AuthController {

    private static final Logger LOG = LoggerFactory.getLogger(AuthController.class);

    @GetMapping(value = "/login_form.html")
    public String loginForm() {
        return "auth/login_form";
    }

    @PostMapping("/login.html")
    public String submit(@ModelAttribute UserDTO userDTO) {
        LOG.info("Hello~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        return "auth/result-2";
    }

    @RequestMapping(value = "/{module}/module.html", method = RequestMethod.GET)
    public String modulePage(
            @PathVariable("page") String page,
            @PathVariable("module") String module) {
        LOG.debug("module = " + module);
        return "module";
    }
}
