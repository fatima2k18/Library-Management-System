package com.demo.example.student_library_management_System.model;
import com.demo.example.student_library_management_System.enums.TransactionType;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

//id, transactionType(BORROW or RETURN), transactionDate, dueDate, fine
@Entity
@Table(name="transactions")
public class Transaction {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name="id",nullable = false)
    private int id;
   @Enumerated(value = EnumType.STRING)
    private TransactionType transactionType;
   @Column(name="transaction_date",nullable = false)
   @CreationTimestamp
    private Date transactionDate;
   @Column(name="due_Date",nullable = false)

    private String dueDate;
  @Column(name="fine",nullable = false)
    private double fine;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
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

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    @JoinColumn
    @ManyToOne
    private Book book;

   @JoinColumn
   @ManyToOne
    private Card card;

}
