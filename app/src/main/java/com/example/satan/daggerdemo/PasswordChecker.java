package com.example.satan.daggerdemo;;

/**
 * Created by alpine on 7/20/16.
 */
public class PasswordChecker {
    int min_length = 5;

    boolean check(String password) {
        return password.length() >= min_length;
    }
}
