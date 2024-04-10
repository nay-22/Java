package com.example.test.demo.model;

import java.util.HashMap;
import java.util.Map;

public class AuthRequest {
    private String email;
    private String password;
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Map<String, String> getCredentials() {
        Map<String, String> credentails = new HashMap<>();
        credentails.put(getEmail(), getPassword());
        return credentails;
    }
}
