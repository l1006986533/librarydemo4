package com.example.demo.controller;

import com.example.demo.service.BookAdditionService;
import com.example.demo.model.Book;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import lombok.Data;


@Data
@RestController
@RequestMapping("/books")
public class BookAdditionController {
    private final BookAdditionService bookAdditionService;

    public BookAdditionController(BookAdditionService bookAdditionService) {
        this.bookAdditionService = bookAdditionService;
    }

    @PostMapping("/add")
    public ResponseEntity<String> addNewBook(@RequestParam String title, @RequestParam String author, @RequestParam String ISBN, @RequestParam String genre, @RequestParam int numberOfCopies) {
        Book book = new Book(title, author, ISBN, genre, numberOfCopies);
        bookAdditionService.addBook(book);
        return new ResponseEntity<>("Book added successfully!", HttpStatus.CREATED);
    }
}