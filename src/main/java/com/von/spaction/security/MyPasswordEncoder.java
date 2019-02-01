package com.von.spaction.security;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author : vons
 * @version : 1.0
 * @date : 2019/2/1 22:14
 */
public class MyPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence charSequence) {
        return null;
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return charSequence.toString().equalsIgnoreCase(s);
//        return false;
    }
}
