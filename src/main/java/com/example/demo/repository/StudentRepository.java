package com.example.demo.repository;
import com.example.demo.model.Student;
import java.util.HashMap;
import java.util.Map;
import com.example.demo.model.Student;
import lombok.Data;


@Data
public class StudentRepository {
    private Map<String, Student> studentDatabase = new HashMap<>();

    public void save(Student student) {
        studentDatabase.put(student.getStudentId(), student);
    }

    public Student findByStudentId(String studentId) {
        return studentDatabase.get(studentId);
    }
}