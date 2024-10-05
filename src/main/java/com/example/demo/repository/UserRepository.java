package com.example.demo.repository;
import com.example.demo.model.User;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
public class UserRepository {
    private List<User> users;

    public UserRepository() {
        this.users = new ArrayList<>();
        // Sample users for demonstration
        users.add(new User("john_doe", "password123", "student"));
        users.add(new User("jane_smith", "password456", "teacher"));
    }

    public User findUserByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null; // User not found
    }
}