package com.example.demo.repository;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;


@Data
public class HomepageRepository {

    public String findLibraryHours() {
        // Implementation to retrieve library hours
        return "Monday to Friday: 9 AM - 5 PM";
    }

    public String findContactInfo() {
        // Implementation to retrieve contact information
        return "Contact us at: contact@example.com";
    }

    public List<String> findRecentAnnouncements() {
        // Implementation to retrieve recent announcements
        List<String> announcements = new ArrayList<>();
        announcements.add("New library hours starting next week.");
        announcements.add("Join us for the book fair this Saturday!");
        return announcements;
    }
}