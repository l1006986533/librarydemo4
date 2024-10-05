package com.example.demo.dto;

import lombok.Data;


@Data
public class BookStatusDTO {
    private String title;
    private String author;
    private int totalCopies;
    private int borrowedCopies;
    private boolean overdueStatus;

}