package com.pccw.immd.adminfunc.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD) //can use in method only.
public @interface AccessAudit{
    public enum AccessActionType{
        LOGIN_SUCCESS("LOGIN"),
        LOGIN_FAIL("FAIL"),
        LOGOUT("LOGOUT"),
        FUNCTION("FUNCTION");

        private String _code;

        private AccessActionType(String code)
        {
            _code = code;
        }

        public String toString()
        {
            return _code;
        }
    }

    AccessActionType value() default AccessActionType.FUNCTION;
}