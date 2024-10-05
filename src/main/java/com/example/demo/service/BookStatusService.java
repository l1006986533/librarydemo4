package com.example.demo.service;
import com.example.demo.dto.BookStatusDTO;
import com.example.demo.repository.BookStatusRepository;
import com.example.demo.model.Book;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Data;
import com.example.demo.repository.BookStatusRepository;


@Data
public class BookStatusService {
    private final BookStatusRepository bookStatusRepository;

    public BookStatusService(BookStatusRepository bookStatusRepository) {
        this.bookStatusRepository = bookStatusRepository;
    }

    public List<BookStatusDTO> retrieveAllBooksStatus(String title, String author, String genre, String availabilityStatus) {
        List<Book> books = bookStatusRepository.findAllBooksStatus(title, author, genre, availabilityStatus);
        // Convert List<Book> to List<BookStatusDTO>
        return books.stream()
            .map(book -> new BookStatusDTO(book.getTitle(), book.getAuthor(), book.getGenre(), book.getAvailabilityStatus()))
            .collect(Collectors.toList());
    }
}