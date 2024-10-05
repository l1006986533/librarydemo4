package com.example.demo.service;
import java.util.List;
import java.util.stream.Collectors;

// Assuming Book and BookDTO are predefined classes
import com.example.demo.dto.BookDTO;
import com.example.demo.model.Book;
import com.example.demo.repository.BookQueryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import lombok.Data;


@Data
@Service
@RequiredArgsConstructor
public class BookQueryService {

    private final BookQueryRepository bookQueryRepository;

    public List<BookDTO> findAvailableBooks(String title, String author, String genre) {
        List<Book> books = bookQueryRepository.findBooksByCriteria(title, author, genre);
        // Convert List<Book> to List<BookDTO>
        return books.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private BookDTO convertToDTO(Book book) {
        // Logic to convert Book to BookDTO
        return new BookDTO(book.getId(), book.getTitle(), book.getAuthor(), book.getGenre());
    }
}