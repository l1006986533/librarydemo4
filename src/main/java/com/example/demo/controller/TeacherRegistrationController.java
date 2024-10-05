package com.example.demo.controller;
import com.example.demo.model.Teacher;
import com.example.demo.service.TeacherRegistrationService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeacherRegistrationController {
    private TeacherRegistrationService teacherRegistrationService;

    public String registerNewTeacher(String name, String employeeId, String department, String contactInfo) {
        Teacher teacher = new Teacher();
        teacher.setName(name);
        teacher.setEmployeeId(employeeId);
        teacher.setDepartment(department);
        teacher.setContactInfo(contactInfo);

        if (teacherRegistrationService.validateTeacherData(teacher)) {
            teacherRegistrationService.addTeacher(teacher);
            return "Teacher registered successfully!";
        } else {
            return "Failed to register teacher: Invalid data provided.";
        }
    }
}