package com.example.demo.dto;
import java.util.List;
import lombok.Data;


@Data
public class HomepageInfoDTO {
    private String libraryHours;
    private String contactInfo;
    private List<String> recentAnnouncements;

    public HomepageInfoDTO(String libraryHours, String contactInfo, List<String> recentAnnouncements) {
        this.libraryHours = libraryHours;
        this.contactInfo = contactInfo;
        this.recentAnnouncements = recentAnnouncements;
    }

    public String getLibraryHours() {
        return libraryHours;
    }

    public void setLibraryHours(String libraryHours) {
        this.libraryHours = libraryHours;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public List<String> getRecentAnnouncements() {
        return recentAnnouncements;
    }

    public void setRecentAnnouncements(List<String> recentAnnouncements) {
        this.recentAnnouncements = recentAnnouncements;
    }
}