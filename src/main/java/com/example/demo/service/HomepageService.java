package com.example.demo.service;
import com.example.demo.dto.HomepageInfoDTO;
import com.example.demo.repository.HomepageRepository;
import lombok.Data;


@Data
public class HomepageService {
    private final HomepageRepository homepageRepository;

    public HomepageService(HomepageRepository homepageRepository) {
        this.homepageRepository = homepageRepository;
    }

    public HomepageInfoDTO fetchHomepageInfo() {
        HomepageInfoDTO homepageInfo = new HomepageInfoDTO();
        homepageInfo.setLibraryHours(homepageRepository.findLibraryHours());
        homepageInfo.setContactInfo(homepageRepository.findContactInfo());
        homepageInfo.setRecentAnnouncements(homepageRepository.findRecentAnnouncements());
        return homepageInfo;
    }
}