package com.example.demo.controller;
import com.example.demo.service.AdminLoginService;
import com.example.demo.model.User;
import lombok.Data;


@Data
public class AdminLoginController {
    private AdminLoginService adminLoginService = new AdminLoginService();

    public String login(String username, String password) {
        User user = adminLoginService.validateAdmin(username, password);
        return adminLoginService.redirectAdmin(user);
    }
}