package com.example.demo.service;
import com.example.demo.repository.BookDeletionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import lombok.Data;


@Data
@Service
@RequiredArgsConstructor
public class BookDeletionService {

    private final BookDeletionRepository bookDeletionRepository;

    public void removeBook(Long bookId) {
        bookDeletionRepository.deleteById(bookId);
    }

    public boolean confirmDeletion(Long bookId) {
        try {
            bookDeletionRepository.findBookById(bookId);
            return false; // Book exists, deletion not confirmed
        } catch (RuntimeException e) {
            return true; // Book does not exist, deletion confirmed
        }
    }
}