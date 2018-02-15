package com.pccw.immd.adminfunc.web.security;

import com.pccw.immd.adminfunc.dto.LoginUser;
import com.pccw.immd.adminfunc.dto.UpmsUser;
import com.pccw.immd.adminfunc.service.UpmsService;
import com.pccw.immd.adminfunc.utils.MessageSourceAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.BadCredentialsException;
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
//            String newPassword = "password1";
//            upmsService.changePassword(authentication.getName(),authentication.getCredentials().toString(), newPassword);
            UpmsUser user = upmsService.login(authentication.getName(), authentication.getCredentials().toString(), termialId);

            List<SimpleGrantedAuthority> authList = new ArrayList<>();
            authList.add(new SimpleGrantedAuthority("ROLE_UMPS_USER"));
            /**
             * Hard code all values to TRUE, no handling to Spring-Security
             * All error from UPMS only display message to error page.
             * If return error is "Password Expired" then togo change password flow
             */

            boolean enabled = true;
            boolean accountNonLocked = true;
            boolean accountNonExpired = true; // isNonExpired(user);
            boolean credentialsNonExpired = true;

            loginUser = new LoginUser(
                    userName,
                    user.getIss3UserSignOnDTO().getUserEngName(),
                    password,
                    enabled,
                    accountNonExpired,
                    credentialsNonExpired,
                    accountNonLocked,
                    authList);

            LoginUser lu = (LoginUser)loginUser;
            lu.setImmdToken(user.getIss3UserSignOnDTO().getImmdToken());

        } catch (ITIAppException | ITISysException e) {
            if (e instanceof ITIAppException) {
                ITIAppException ex = (ITIAppException)e;
                ex.getFaultInfo().setLoginId(authentication.getName());
            }
            throw new BadCredentialsException(e.getMessage(), e);
        }

        if (loginUser == null) {
            throw new BadCredentialsException(messageSourceAdapter.getMessage("umps.useridandpassword.notempty"));
        } else {
            return loginUser;
        }
    }

    /*
    private boolean isNonExpired(UpmsUser user) {
        Date current = new Date();
        Calendar expiryDate = user.getIss3UserSignOnDTO().getPasswordExpiryDateTime().toGregorianCalendar();
        expiryDate.add(Calendar.DAY_OF_YEAR, -1 * passwordExpiryDay);
        if(current.after(expiryDate.getTime()))
            return false;
        return true;
    }
    */

}