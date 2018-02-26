package com.pccw.immd.adminfunc.config;

import com.pccw.immd.adminfunc.web.security.AdminFuncAuthenticationSuccessHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by jeff on 5/7/17.
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled=true)
@ImportResource ("classpath:config/security-context.xml")
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    private static final Logger LOG = LoggerFactory.getLogger(WebSecurityConfig.class);


    @Value("${web.auth.logInUrl}")
    private String loginUrl;

    @Value("${web.auth.errorPage}")
    private String errorPage;

    @Value("${web.auth.logInProcessingUrl}")
    private String logInProcessingUrl;

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

    @Autowired
    @Qualifier("authenticationSuccessHandler")
    private AdminFuncAuthenticationSuccessHandler authenticationSuccessHandler;

    @Autowired
    @Qualifier("upmsAuthenticationProvider")
    private AuthenticationProvider upmsAuthenticationProvider;

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
            .formLogin().permitAll()
            .usernameParameter("user.userId")
            .passwordParameter("user.password")
            .loginPage(loginUrl)
            .loginProcessingUrl(logInProcessingUrl).permitAll()
            .successHandler(authenticationSuccessHandler)
            .failureForwardUrl(authenticationFailureUrl)
//        .and()
//            .exceptionHandling()
            .failureHandler(authenticationFailureHandler)
        .and()
            .logout().permitAll()
            .logoutUrl(logOutUrl)
            .logoutSuccessUrl(logOutSuccessUrl)
            .clearAuthentication(true)
            .invalidateHttpSession(true)
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
        web.ignoring().antMatchers(
                "/AUTH/login-fail.do",
                "/AUTH/logout-result.do",
                "/changePassword.do",
                "/submitChangePassword.do",
                "/changePassword"
        );
    }

    public class MvcWebApplicationInitializer extends
            AbstractAnnotationConfigDispatcherServletInitializer {

        @Override
        protected Class<?>[] getRootConfigClasses() {
            return new Class[] { WebSecurityConfig.class };
        }

        @Override
        protected String[] getServletMappings() {
            return new String[] {};
        }

        @Override
        protected Class<?>[] getServletConfigClasses(){
            return new Class[] {};
        }
    }
}
