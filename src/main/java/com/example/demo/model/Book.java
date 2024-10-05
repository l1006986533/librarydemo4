package com.example.demo.model;

import lombok.Data;


@Data
public class Book {
    private Long id;
    private String title;
    private String author;
    private String ISBN;
    private String genre;
    private String AvailabilityStatus;
}