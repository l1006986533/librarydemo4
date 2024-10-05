package com.example.demo.controller;
import com.example.demo.service.StudentRegistrationService;
import com.example.demo.model.Student;
import lombok.Data;


@Data
public class StudentRegistrationController {
    private final StudentRegistrationService studentRegistrationService;

    public StudentRegistrationController(StudentRegistrationService studentRegistrationService) {
        this.studentRegistrationService = studentRegistrationService;
    }

    public String registerNewStudent(String name, String studentId, String className, String contactInfo) {
        Student student = new Student();
        student.setName(name);
        student.setStudentId(studentId);
        student.setClassName(className);
        student.setContactInfo(contactInfo);

        if (studentRegistrationService.validateStudentData(student)) {
            studentRegistrationService.addStudent(student);
            return "Student registered successfully!";
        } else {
            return "Failed to register student: Invalid data provided.";
        }
    }
}