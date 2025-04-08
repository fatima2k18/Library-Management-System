package com.demo.example.student_library_management_System.requestdto;

import com.demo.example.student_library_management_System.enums.TransactionType;
import jakarta.persistence.Column;

public class TransactionRequestDto {
    //RequestDto - Request data transfer object-it is used to take input request fields
    private String dueDate;
    private double fine;
    private TransactionType transactionType;
    private int bookId;
    private int cardId;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }
}
