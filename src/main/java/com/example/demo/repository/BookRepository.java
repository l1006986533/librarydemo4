package com.example.demo.repository;
import java.util.List;

import com.example.demo.model.Book;
import lombok.Data;


@Data
public class BookRepository {

    public void saveAll(List<Book> books) {
        // Implementation for saving all books to the database
    }

    public List<Book> findAll() {
        // Implementation for retrieving all books from the database
        return null; // Replace with actual retrieval logic
    }
}