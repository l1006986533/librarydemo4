package com.example.demo.model;

import lombok.Data;


@Data
public class User {
    private String username;
    private String password;
    private String role;

    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public boolean authenticateUser(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public String getRole() {
        return this.role;
    }
}