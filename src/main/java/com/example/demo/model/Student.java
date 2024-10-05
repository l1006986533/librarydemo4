package com.example.demo.model;

import lombok.Data;


@Data
public class Student {
    private String name;
    private String studentId;
    private String className;
    private String contactInfo;

    public Student(String name, String studentId, String className, String contactInfo) {
        this.name = name;
        this.studentId = studentId;
        this.className = className;
        this.contactInfo = contactInfo;
    }

    public void registerStudent(Student student) {
        // Implementation for registering the student in the library system
    }

    public Student getStudentDetails(String studentId) {
        // Implementation for retrieving student details based on studentId
        return null; // Placeholder return
    }
}