package com.pccw.immd.adminfunc.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class PasswordUtil {
    private final static Logger LOOGER = LoggerFactory.getLogger(PasswordUtil.class);

    private static String decoratePassword(String hashedPassword) {
        return "{sha256}" + hashedPassword;
    }

    public static String performHash(String password) {
        byte[] data = password.getBytes();
        try {
            MessageDigest digester = MessageDigest.getInstance("SHA-256");
            digester.update(data);
            return decoratePassword(Base64.getEncoder().encodeToString(digester.digest()));
        } catch (NoSuchAlgorithmException ex){
            LOOGER.debug("PerformHash Password Exception ... ");
        }
        return password;
    }
}