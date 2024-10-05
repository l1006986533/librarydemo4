package com.example.demo.controller;
import com.example.demo.service.BookQueryService;
import com.example.demo.dto.BookDTO;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import lombok.Data;


@Data
@RestController
@RequestMapping("/books")
public class BookQueryController {

    private final BookQueryService bookService;

    public BookQueryController(BookQueryService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/available")
    public List<BookDTO> queryAvailableBooks(@RequestParam(required = false) String title,
                                              @RequestParam(required = false) String author,
                                              @RequestParam(required = false) String genre) {
        return bookService.findAvailableBooks(title, author, genre);
    }
}