package com.pccw.immd.adminfunc.utils.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class PasswordUtilTest {
    private final static Logger LOOGER = LoggerFactory.getLogger(PasswordUtilTest.class);

    @Test
    public void genSha256Password() throws  NoSuchAlgorithmException{
        String input = "C123456";
        String hashedValue = "";
        MessageDigest digester = MessageDigest.getInstance("SHA-256");
        digester.update(input.getBytes());
        hashedValue = Base64.getEncoder().encodeToString(digester.digest());
        System.out.println("{sha256}" + hashedValue);
    }
}