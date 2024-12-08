package com.cansubdc.site.service;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate (String username, String password){
        Boolean isValidUserName = "cansuBdc".equals(username);
        Boolean isValidPassword = "123".equals(password);
        return isValidUserName && isValidPassword;
    }
}
