package com.example.demo.repository;
import com.example.demo.model.User;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
public class AdminLoginRepository {
    private List<User> users;

    public AdminLoginRepository() {
        this.users = new ArrayList<>();
        // Sample data for demonstration
        this.users.add(new User("admin", "admin123", "ADMIN"));
        this.users.add(new User("user", "user123", "USER"));
    }

    public User findAdminByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getRole().equals("ADMIN")) {
                return user;
            }
        }
        return null;
    }
}