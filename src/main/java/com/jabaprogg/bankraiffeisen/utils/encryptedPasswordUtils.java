package com.jabaprogg.bankraiffeisen.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class encryptedPasswordUtils {

    public static String encryptPassword(String password) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }

}
