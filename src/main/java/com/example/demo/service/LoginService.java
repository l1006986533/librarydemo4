package com.example.demo.service;
import com.example.demo.model.User;
import lombok.Data;


@Data
public class LoginService {
    public User validateUser(String username, String password) {
        User user = new User(username, password, ""); // Assuming role is set later
        if (user.authenticateUser(username, password)) {
            return user;
        }
        return null; // Return null if authentication fails
    }

    public String redirectUser(User user) {
        if (user != null) {
            switch (user.getRole()) {
                case "admin":
                    return "redirect:/admin/dashboard";
                case "teacher":
                    return "redirect:/teacher/home";
                case "student":
                    return "redirect:/student/home";
                default:
                    return "redirect:/login";
            }
        }
        return "redirect:/login"; // Default redirect if user is null
    }
}