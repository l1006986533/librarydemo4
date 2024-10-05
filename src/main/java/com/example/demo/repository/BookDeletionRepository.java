package com.example.demo.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import lombok.Data;
import com.example.demo.model.Book;

@Data
public class BookDeletionRepository {

    // Simulated database
    private Map<Long, Book> bookDatabase = new HashMap<>();

    public void deleteById(Long bookId) {
        bookDatabase.remove(bookId);
    }

    public Book findBookById(Long bookId) {
        return Optional.ofNullable(bookDatabase.get(bookId))
                       .orElseThrow(() -> new RuntimeException("Book not found"));
    }
}