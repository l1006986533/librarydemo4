package com.example.demo.controller;
import com.example.demo.service.LoginService;
import com.example.demo.model.User;
import lombok.Data;


@Data
public class LoginController {
    private LoginService loginService = new LoginService();

    public String login(String username, String password) {
        User user = loginService.validateUser(username, password);
        return loginService.redirectUser(user);
    }
}