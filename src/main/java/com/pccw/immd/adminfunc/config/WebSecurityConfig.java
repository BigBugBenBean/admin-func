package com.pccw.immd.adminfunc.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.context.SecurityContextPersistenceFilter;

/**
 * Created by jeff on 5/7/17.
 */
@Configuration
@EnableWebSecurity
@ImportResource ("classpath:config/security-context.xml")
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    private static final Logger LOG = LoggerFactory.getLogger(WebSecurityConfig.class);


    @Value("${web.auth.logInUrl}")
    private String loginUrl;

    @Value("${web.auth.errorPage}")
    private String errorPage;

    @Value("${web.auth.logInProcessingUrl}")
    private String logInProcessingUrl;

    @Value("${web.auth.logInDefaultTargetUrl}")
    private String logInDefaultTargetUrl;

    @Value("${web.auth.authenticationFailureUrl}")
    private String authenticationFailureUrl;

    /* Logout */
    @Value("${web.auth.logOutUrl}")
    private String logOutUrl;

    @Value("${web.auth.logOutSuccessUrl}")
    private String logOutSuccessUrl;

    /* intercepter */
    @Value("${web.auth.interceptUrlPattern}")
    private String interceptUrlPattern;

    @Value("${web.auth.interceptUrlAccess}")
    private String interceptUrlAccess;

    /* Session */
    @Value("${web.auth.invalidSessionUrl}")
    private String invalidSessionUrl;

    @Autowired
    @Qualifier("authenticationFailureHandler")
    private AuthenticationFailureHandler authenticationFailureHandler;

//    @Autowired
//    @Qualifier("securityContextFilter")
//    private SecurityContextPersistenceFilter securityContextFilter;

    @Autowired
    @Qualifier("upmsAuthenticationProvider")
    private AuthenticationProvider upmsAuthenticationProvider;



    protected void configure1(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .permitAll();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers(loginUrl).permitAll();
        LOG.info("in security configure (HttpSecurity) ...");

        http
            .csrf().disable()
            .httpBasic().disable()
            .authorizeRequests()
            .antMatchers(interceptUrlPattern)
            .hasRole(interceptUrlAccess)
            .anyRequest().authenticated()
        .and()
            .formLogin()
            .usernameParameter("user.userId")
            .passwordParameter("user.password")
            .loginPage(loginUrl).permitAll()
            .loginProcessingUrl(logInProcessingUrl)
            .defaultSuccessUrl(logInDefaultTargetUrl)
            .failureForwardUrl(authenticationFailureUrl)
            .failureHandler(authenticationFailureHandler)
        .and()
            .logout().permitAll()
            .logoutUrl(logOutUrl)
            .logoutSuccessUrl(logOutSuccessUrl)
            .invalidateHttpSession(true)
            .clearAuthentication(true)
        .and()
            .sessionManagement().invalidSessionUrl(invalidSessionUrl)
        .and()
            .authenticationProvider(upmsAuthenticationProvider);

    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        LOG.info("in security configure(WebSecurity) ...");
        web.ignoring().antMatchers(
                "/css/**",
                "/images/**",
                "/js/**"
        );
    }
}
