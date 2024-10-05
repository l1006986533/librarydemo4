package com.example.demo.controller;
import com.example.demo.service.BookStatusService;
import com.example.demo.dto.BookStatusDTO;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import lombok.Data;


@Data
@RestController
@RequestMapping("/books/status")
public class BookStatusController {
    private final BookStatusService bookStatusService;

    public BookStatusController(BookStatusService bookStatusService) {
        this.bookStatusService = bookStatusService;
    }

    @GetMapping
    public List<BookStatusDTO> getAllBooksStatus(@RequestParam(required = false) String title,
                                                  @RequestParam(required = false) String author,
                                                  @RequestParam(required = false) String genre,
                                                  @RequestParam(required = false) String availabilityStatus) {
        return bookStatusService.retrieveAllBooksStatus(title, author, genre, availabilityStatus);
    }
}