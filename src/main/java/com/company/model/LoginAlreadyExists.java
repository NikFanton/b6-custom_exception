package com.company.model;

public class LoginAlreadyExists extends Exception {
    public LoginAlreadyExists(String message) {
        super(message);
    }
}
