package com.example.demo.service;
import com.example.demo.model.Teacher;
import lombok.Data;


@Data
public class TeacherRegistrationService {
    public void addTeacher(Teacher teacher) {
        // Implementation for adding the teacher to the system
        teacher.registerTeacher(teacher);
    }

    public boolean validateTeacherData(Teacher teacher) {
        // Basic validation logic for teacher data
        if (teacher.getName() == null || teacher.getName().isEmpty()) {
            return false;
        }
        if (teacher.getEmployeeId() == null || teacher.getEmployeeId().isEmpty()) {
            return false;
        }
        if (teacher.getDepartment() == null || teacher.getDepartment().isEmpty()) {
            return false;
        }
        if (teacher.getContactInfo() == null || teacher.getContactInfo().isEmpty()) {
            return false;
        }
        return true;
    }
}