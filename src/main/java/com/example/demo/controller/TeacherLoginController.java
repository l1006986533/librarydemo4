package com.example.demo.controller;
import com.example.demo.service.TeacherLoginService;
import com.example.demo.model.User;
import lombok.Data;


@Data
public class TeacherLoginController {
    private TeacherLoginService teacherLoginService = new TeacherLoginService();

    public String login(String username, String password) {
        User user = teacherLoginService.validateTeacher(username, password);
        return teacherLoginService.redirectTeacher(user);
    }
}