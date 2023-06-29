package com.piPay.security.user.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException (String message){
        super("user with token: " + message + " was not found" );
    }
}
