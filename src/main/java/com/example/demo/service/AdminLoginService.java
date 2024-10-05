package com.example.demo.service;
import com.example.demo.model.User;
import lombok.Data;


@Data
public class AdminLoginService {
    public User validateAdmin(String username, String password) {
        User user = new User(username, password, "admin");
        if (user.authenticateUser(username, password)) {
            return user;
        }
        return null;
    }

    public String redirectAdmin(User user) {
        if (user != null && "admin".equals(user.getRole())) {
            return "Redirecting to admin dashboard...";
        }
        return "Access denied!";
    }
}