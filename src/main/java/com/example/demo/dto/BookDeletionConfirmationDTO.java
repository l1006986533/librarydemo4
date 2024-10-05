package com.example.demo.dto;

import lombok.Data;


@Data
public class BookDeletionConfirmationDTO {
    private Long bookId;
    private boolean confirmationStatus;

    public BookDeletionConfirmationDTO(Long bookId, boolean confirmationStatus) {
        this.bookId = bookId;
        this.confirmationStatus = confirmationStatus;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public boolean isConfirmationStatus() {
        return confirmationStatus;
    }

    public void setConfirmationStatus(boolean confirmationStatus) {
        this.confirmationStatus = confirmationStatus;
    }
}