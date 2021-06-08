package com.aim.app.configs.util;

public class AuthenticationResponse {
    private final String jwt;

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }
    public String jwt(){
        return jwt;
    }
}