package com.pccw.immd.adminfunc.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ResourceBundleMessageSource;

import java.util.Locale;

public class MessageSourceAdapter {

    @Autowired
    @Qualifier("messageSource")
    private ResourceBundleMessageSource messageSource;

    public String getMessage(String key){
        return this.getMessage(key, null);
    }

    public String getMessage(String key, Object ... args){
        return messageSource.getMessage(key, args, Locale.US);
    }
}