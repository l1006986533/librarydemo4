package com.example.demo.dto;

import lombok.Data;


@Data
public class BookDTO {
    private String title;
    private String author;
    private String ISBN;
    private String genre;
    private int numberOfCopies;

    public BookDTO(String title, String author, String ISBN, String genre, int numberOfCopies) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.genre = genre;
        this.numberOfCopies = numberOfCopies;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getGenre() {
        return genre;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }
}