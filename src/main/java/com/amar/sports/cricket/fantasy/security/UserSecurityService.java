package com.amar.sports.cricket.fantasy.security;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import static java.util.Arrays.asList;

@Service
public class UserSecurityService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String usename) throws UsernameNotFoundException {
        System.out.println("username for authentication: " + usename);
        return new User("amar", "patel", asList(new SimpleGrantedAuthority("ROLE_USER")));
    }
}
