package com.example.demo.service;
import com.example.demo.model.Student;
import lombok.Data;


@Data
public class StudentRegistrationService {
    public void addStudent(Student student) {
        // Implementation for adding the student to the system
    }

    public boolean validateStudentData(Student student) {
        // Implementation for validating student data
        // Example validation: check if name and studentId are not null or empty
        if (student.getName() == null || student.getName().isEmpty()) {
            return false;
        }
        if (student.getStudentId() == null || student.getStudentId().isEmpty()) {
            return false;
        }
        return true;
    }
}