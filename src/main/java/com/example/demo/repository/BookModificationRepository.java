package com.example.demo.repository;
import com.example.demo.model.Book;
import java.util.HashMap;
import java.util.Map;
import lombok.Data;


@Data
public class BookModificationRepository {
    private Map<Long, Book> bookDatabase = new HashMap<>();

    public Book findBookById(Long bookId) {
        return bookDatabase.get(bookId);
    }

    public void save(Book book) {
        bookDatabase.put(book.getId(), book);
    }
}