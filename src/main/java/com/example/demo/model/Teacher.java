package com.example.demo.model;

import lombok.Data;


@Data
public class Teacher {
    private String name;
    private String employeeId;
    private String department;
    private String contactInfo;

    public Teacher(String name, String employeeId, String department, String contactInfo) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.contactInfo = contactInfo;
    }

    public void registerTeacher(Teacher teacher) {
        // Implementation for registering the teacher in the system
    }

    public Teacher getTeacherDetails(String employeeId) {
        // Implementation for retrieving teacher details by employeeId
        return null; // Placeholder return
    }
}