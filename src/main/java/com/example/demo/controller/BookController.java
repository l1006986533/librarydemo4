package com.example.demo.controller;
import com.example.demo.service.BookService;
import com.example.demo.model.Book;
import java.util.List;
import org.springframework.web.bind.annotation.*;
import lombok.Data;


@Data
@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/upload")
    public String uploadBooks(@RequestBody List<Book> books) {
        bookService.saveBooks(books);
        return "Books uploaded successfully!";
    }
}