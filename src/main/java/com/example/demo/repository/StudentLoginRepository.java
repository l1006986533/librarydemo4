package com.example.demo.repository;
import com.example.demo.model.User;
import java.util.HashMap;
import java.util.Map;
import com.example.demo.model.User;
import lombok.Data;


@Data
public class StudentLoginRepository {
    private Map<String, User> userDatabase;

    public StudentLoginRepository() {
        userDatabase = new HashMap<>();
        // Sample data for demonstration
        userDatabase.put("student1", new User("student1", "password1", "student"));
        userDatabase.put("student2", new User("student2", "password2", "student"));
    }

    public User findStudentByUsername(String username) {
        return userDatabase.get(username);
    }
}