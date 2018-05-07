package com.pccw.immd.adminfunc.web.security;

import com.pccw.immd.adminfunc.dto.LoginUser;
import com.pccw.immd.adminfunc.dto.UpmsUser;
import com.pccw.immd.adminfunc.mock.MockLoginUser;
import com.pccw.immd.adminfunc.service.UpmsService;
import com.pccw.immd.adminfunc.utils.MessageSourceAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.SpringSecurityMessageSource;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import ws.upms.immd.v1.ITIAppException;
import ws.upms.immd.v1.ITISysException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dell on 30/1/2018.
 */
@Component("upmsAuthenticationProvider")
public class UpmsAuthenticationProvider implements AuthenticationProvider, InitializingBean, MessageSourceAware {

    private static final Logger LOG = LoggerFactory.getLogger(UpmsAuthenticationProvider.class);

    protected MessageSourceAccessor messages = SpringSecurityMessageSource.getAccessor();

    @Autowired
    @Qualifier("messageSourceAdapter")
    MessageSourceAdapter messageSourceAdapter;

    @Autowired
    @Qualifier("upmsService")
    private UpmsService upmsService;

    @Value("${web.loginmode.byrole:false}")
    private boolean roleLoginMode;

    @Value("${web.loginmode.demouser:false}")
    private boolean demoUserMode;


    public final void afterPropertiesSet() throws Exception {
        Assert.notNull(this.messages, "A message source must be set");
    }
    public void setMessageSource(MessageSource messageSource) {
        this.messages = new MessageSourceAccessor(messageSource);
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        UserDetails loginUser = null;
        String userName = authentication.getName();
        String password = authentication.getCredentials().toString();
        String termialId = "";

        // Hard code authority list
        List<SimpleGrantedAuthority> authList = new ArrayList<>();
        authList.add(new SimpleGrantedAuthority("ROLE_UMPS_USER"));

        if (userName.isEmpty() || password.isEmpty())
            throw new BadCredentialsException(messageSourceAdapter.getMessage("umps.useridandpassword.notempty"));

        String demoPrefix = "demo";
        if (demoUserMode && userName.startsWith(demoPrefix)) {
            LOG.info("Using demo account in testing env. ONLY.");

            List<String> roleCDs = new ArrayList<>();
            roleCDs.add(password);
            MockLoginUser mockLoginUser = new MockLoginUser(
                    userName,
                    password,
                    roleCDs,
                    authList);

            return new UsernamePasswordAuthenticationToken(mockLoginUser, authentication.getCredentials(), authList);
        }

        if (roleLoginMode) {
            LOG.info("Using roleCD to login in testing env. ONLY.");

            List<String> roleCDs = new ArrayList<>();
            roleCDs.add(userName);
            MockLoginUser mockLoginUser = new MockLoginUser(
                    userName,
                    password,
                    roleCDs,
                    authList);
            LOG.info("Using Mock loginUser (Uesrname as RoleCD)");
            return new UsernamePasswordAuthenticationToken(mockLoginUser, authentication.getCredentials(), authList);
        }

        try {
            UpmsUser upmsUser = upmsService.login(authentication.getName(), password, termialId);

            LOG.debug("Login Success.");

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
                    upmsUser,
                    password,
                    enabled,
                    accountNonExpired,
                    credentialsNonExpired,
                    accountNonLocked,
                    authList);

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
            authentication = new UsernamePasswordAuthenticationToken(loginUser, authentication.getCredentials(), authList);
            return authentication;
        }
    }

    public boolean supports(Class<?> authentication) {
        return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
    }

}