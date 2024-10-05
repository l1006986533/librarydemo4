package com.example.demo.repository;

import com.example.demo.model.Book;
import lombok.Data;


@Data
public class BookAdditionRepository {
    public void save(Book book) {
        // Implementation for saving the book to the database
    }
}