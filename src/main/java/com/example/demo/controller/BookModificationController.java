package com.example.demo.controller;
import com.example.demo.service.BookModificationService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import lombok.Data;


@Data
@RestController
@RequestMapping("/books")
public class BookModificationController {
    private final BookModificationService bookModificationService;

    public BookModificationController(BookModificationService bookModificationService) {
        this.bookModificationService = bookModificationService;
    }

    @PutMapping("/{bookId}")
    public ResponseEntity<String> modifyBookInfo(
            @PathVariable Long bookId,
            @RequestParam String title,
            @RequestParam String author,
            @RequestParam String ISBN,
            @RequestParam String genre,
            @RequestParam int numberOfCopies) {
        try {
            bookModificationService.updateBookInformation(bookId, title, author, ISBN, genre, numberOfCopies);
            return new ResponseEntity<>("Book information updated successfully", HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}