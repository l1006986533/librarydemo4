package com.example.demo.controller;
import com.example.demo.service.StudentLoginService;
import com.example.demo.model.User;
import lombok.Data;


@Data
public class StudentLoginController {
    private StudentLoginService studentLoginService = new StudentLoginService();

    public String login(String username, String password) {
        User user = studentLoginService.validateStudent(username, password);
        return studentLoginService.redirectStudent(user);
    }
}