package com.example.demo.controller;
import com.example.demo.service.BookDeletionService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import lombok.Data;


@Data
@RestController
public class BookDeletionController {

    private final BookDeletionService bookDeletionService;

    public BookDeletionController(BookDeletionService bookDeletionService) {
        this.bookDeletionService = bookDeletionService;
    }

    @DeleteMapping("/books/{bookId}")
    public String deleteBook(@PathVariable Long bookId) {
        if (bookDeletionService.confirmDeletion(bookId)) {
            bookDeletionService.removeBook(bookId);
            return "Book deleted successfully.";
        } else {
            return "Book not found, deletion not performed.";
        }
    }
}