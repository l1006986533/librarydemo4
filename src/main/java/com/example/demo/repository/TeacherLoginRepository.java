package com.example.demo.repository;
import com.example.demo.model.User;
import com.example.demo.model.User;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
public class TeacherLoginRepository {
    private List<User> users;

    public TeacherLoginRepository() {
        this.users = new ArrayList<>();
        // Sample data for demonstration
        users.add(new User("teacher1", "password1", "TEACHER"));
        users.add(new User("teacher2", "password2", "TEACHER"));
    }

    public User findTeacherByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null; // Return null if no user found
    }
}