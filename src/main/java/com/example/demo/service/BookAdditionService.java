package com.example.demo.service;
import com.example.demo.model.Book;
import com.example.demo.repository.BookAdditionRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
@RequiredArgsConstructor
public class BookAdditionService {
    private final BookAdditionRepository bookAdditionRepository;

    public void addBook(Book book) {
        bookAdditionRepository.save(book);
    }
}