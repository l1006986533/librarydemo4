package com.example.demo.repository;
import com.example.demo.model.Teacher;
import java.util.HashMap;
import java.util.Map;
import com.example.demo.model.Teacher;
import lombok.Data;


@Data
public class TeacherRepository {
    private Map<String, Teacher> teacherDatabase = new HashMap<>();

    public void save(Teacher teacher) {
        teacherDatabase.put(teacher.getEmployeeId(), teacher);
    }

    public Teacher findByEmployeeId(String employeeId) {
        return teacherDatabase.get(employeeId);
    }
}