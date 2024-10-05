package com.example.demo.service;
import com.example.demo.model.Book;
import com.example.demo.repository.BookModificationRepository;
import lombok.Data;


@Data
public class BookModificationService {
    private final BookModificationRepository bookModificationRepository;

    public BookModificationService(BookModificationRepository bookModificationRepository) {
        this.bookModificationRepository = bookModificationRepository;
    }

    public void updateBookInformation(Long bookId, String title, String author, String ISBN, String genre, int numberOfCopies) {
        Book book = bookModificationRepository.findBookById(bookId);
        if (book != null) {
            book.setTitle(title);
            book.setAuthor(author);
            book.setISBN(ISBN);
            book.setGenre(genre);
            book.setNumberOfCopies(numberOfCopies);
            bookModificationRepository.save(book);
        } else {
            throw new IllegalArgumentException("Book not found");
        }
    }
}