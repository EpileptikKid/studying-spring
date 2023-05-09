package com.example.differentscopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class LoginProcessor {

    private final LoggedUserManagementService loggedUserManagementService;
    private String username;
    private String password;

    @Autowired
    public LoginProcessor(LoggedUserManagementService loggedUserManagementService) {
        System.out.println("create " + loggedUserManagementService);
        this.loggedUserManagementService = loggedUserManagementService;
    }


    public boolean login() {
        if ("Andrii".equals(username) && "password".equals(password)) {
            loggedUserManagementService.setUsername(username);
            return true;
        } else {
            return false;
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
