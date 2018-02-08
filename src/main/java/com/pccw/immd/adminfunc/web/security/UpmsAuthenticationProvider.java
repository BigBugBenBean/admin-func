package com.pccw.immd.adminfunc.web.security;

import com.pccw.immd.adminfunc.dto.LoginUser;
import com.pccw.immd.adminfunc.dto.UpmsUser;
import com.pccw.immd.adminfunc.service.UpmsService;
import com.pccw.immd.adminfunc.utils.MessageSourceAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import ws.upms.immd.v1.ITIAppException;
import ws.upms.immd.v1.ITISysException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dell on 30/1/2018.
 */
@Component("upmsAuthenticationProvider")
public class UpmsAuthenticationProvider extends AbstractUserDetailsAuthenticationProvider {

    @Autowired
    @Qualifier("messageSourceAdapter")
    MessageSourceAdapter messageSourceAdapter;

    @Autowired
    @Qualifier("upmsService")
    private UpmsService upmsService;

    @Override
    protected void additionalAuthenticationChecks(UserDetails userDetails, UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {
        if (authentication.getCredentials() == null) {
            this.logger.debug("Authentication failed: no credentials provided");
            throw new BadCredentialsException(this.messages.getMessage("AbstractUserDetailsAuthenticationProvider.badCredentials", "Bad credentials"));
        }
    }

    @Override
    protected UserDetails retrieveUser(String userName, UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {
        UserDetails loginUser = null;
        String password = authentication.getCredentials().toString();
        String termialId = "";

        if (userName.isEmpty() || password.isEmpty())
            throw new BadCredentialsException(messageSourceAdapter.getMessage("umps.useridandpassword.notempty"));


        String demoPrefix = "demo";

        if (userName.startsWith(demoPrefix)) {
            List<SimpleGrantedAuthority> authList = new ArrayList<>();
            authList.add(new SimpleGrantedAuthority("ROLE_UMPS_USER"));

            loginUser = new LoginUser(
                    userName,
                    // user.getIss3UserSignOnDTO().getUserEngName(),
                    "FULL NAME",
                    password,
                    true,
                    true,
                    true,
                    true,
                    authList);

            return loginUser;
        }


        try {

         UpmsUser user = upmsService.login(authentication.getName(), authentication.getCredentials().toString(), termialId);

        List<SimpleGrantedAuthority> authList = new ArrayList<>();
        authList.add(new SimpleGrantedAuthority("ROLE_UMPS_USER"));
        // TODO: for complete those
        boolean enabled = true;
        boolean accountNonLocked = true;
        boolean accountNonExpired = true;
        boolean credentialsNonExpired = true;

        loginUser = new LoginUser(
                userName,
                // user.getIss3UserSignOnDTO().getUserEngName(),
                "FULL NAME",
                password,
                enabled,
                accountNonExpired,
                credentialsNonExpired,
                accountNonLocked,
                authList);


        } catch (ITIAppException | ITISysException e){
            throw new BadCredentialsException(e.getMessage(), e);
        }

        if (loginUser == null) {
            throw new InternalAuthenticationServiceException("LoginedUser null, which is an interface contract violation");
        } else {
            return loginUser;
        }
    }
}