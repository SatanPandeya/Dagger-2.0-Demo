package com.example.satan.daggerdemo;;

import javax.inject.Inject;

/**
 * Created by alpine on 7/20/16.
 */
public class LoginHandler {
    private PasswordChecker passwordChecker;

    @Inject
    public LoginHandler(PasswordChecker passwordChecker) {
        this.passwordChecker = passwordChecker;
    }

    public boolean login(String username, String password) {
        if(passwordChecker != null) {
            return passwordChecker.check(password);
        }
        return false;
    }
}
