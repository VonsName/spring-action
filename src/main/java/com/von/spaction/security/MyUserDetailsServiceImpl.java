package com.von.spaction.security;

import com.von.spaction.springmvc.SpittleRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @author : vons
 * @version : 1.0
 * @date : 2019/2/1 22:28
 */
public class MyUserDetailsServiceImpl implements UserDetailsService {

    private SpittleRepository spittleRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        new User()
        return null;
    }
}
