package com.example.demo.service;
import com.example.demo.model.User;
import lombok.Data;


@Data
public class StudentLoginService {
    public User validateStudent(String username, String password) {
        User user = new User(username, password, "student"); // Assuming role is 'student'
        if (user.authenticateUser(username, password)) {
            return user;
        }
        return null; // Return null if authentication fails
    }

    public String redirectStudent(User user) {
        if (user != null) {
            return "Redirecting to student dashboard for user: " + user.getRole();
        }
        return "Redirect failed: User is null";
    }
}