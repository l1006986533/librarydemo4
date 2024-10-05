package com.example.demo.service;
import java.util.List;
import lombok.RequiredArgsConstructor;
import com.example.demo.repository.BookRepository;
import com.example.demo.model.Book;
import lombok.Data;


@Data

@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    public void saveBooks(List<Book> books) {
        bookRepository.saveAll(books);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}