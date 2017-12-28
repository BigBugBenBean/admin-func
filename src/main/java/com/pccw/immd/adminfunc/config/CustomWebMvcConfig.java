package com.pccw.immd.adminfunc.config;


import com.pccw.immd.commons.validator.CompositeValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.Validator;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by pccw on 2017-05-18.
 */
@Configuration
@EnableWebMvc
public class CustomWebMvcConfig extends WebMvcConfigurerAdapter {

    private static final Logger LOG = LoggerFactory.getLogger(CustomWebMvcConfig.class);

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry.addResourceHandler("*.js").resourceChain(true);
        registry.addResourceHandler("*.html").resourceChain(false);
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");

        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");

    }

    @Autowired
    private CompositeValidator validator;

    @Override
    public Validator getValidator() {
        return validator;
    }


}
