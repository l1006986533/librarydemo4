package com.example.demo.controller;

import com.example.demo.dto.HomepageInfoDTO;
import com.example.demo.service.HomepageService;
import lombok.Data;

import java.util.List;


@Data
public class HomepageController {
    private final HomepageService homepageService;
    private String libraryHours;
    private String contactInfo;
    private List<String> recentAnnouncements;

    public HomepageController(HomepageService homepageService) {
        this.homepageService = homepageService;
    }

    public HomepageInfoDTO getHomepageInfo() {
        return homepageService.fetchHomepageInfo();
    }

    public String navigateToLogin(String userType) {
        // Logic to navigate to login based on userType
        return "Navigating to login for user type: " + userType;
    }
}