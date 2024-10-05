package com.example.demo.service;
import com.example.demo.model.User;
import lombok.Data;


@Data
public class TeacherLoginService {

    public User validateTeacher(String username, String password) {
        User user = new User(username, password, "TEACHER"); // Assuming role is TEACHER
        if (user.authenticateUser(username, password)) {
            return user;
        }
        return null; // Return null if authentication fails
    }

    public String redirectTeacher(User user) {
        if (user != null && "TEACHER".equals(user.getRole())) {
            return "Redirecting to teacher dashboard...";
        }
        return "Access denied!";
    }
}