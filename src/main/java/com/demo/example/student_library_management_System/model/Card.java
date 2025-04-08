package com.demo.example.student_library_management_System.model;
import com.demo.example.student_library_management_System.enums.CardStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="card")
public class Card {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id",nullable = false)
    private int id;
    public int getId() {
        return id;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public CardStatus getCardStatus() {

        return cardStatus;
    }

    public void setCardStatus(CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "card_status", nullable = false)
   @Enumerated(value = EnumType.STRING)//IT Will convert enum value as string and store it in database
    private CardStatus cardStatus;

  @Column(name="createDate",nullable = false)
  @CreationTimestamp//When card is creating, automatically adds date and time
    private Date createDate;
   @Column(name = "UpdateDate",nullable = false)
   @UpdateTimestamp//when card is updating, automatically adds date and time
    private Date updatedDate;
@OneToOne
@JoinColumn //It joins the primary key of student table as foreign key in card table
   private Student student;
//@OneToMany(mappedBy = "card", cascade = CascadeType.ALL)
//private List<Card> cardList=new ArrayList<>();

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    @OneToMany(mappedBy = "card",cascade = CascadeType.ALL)
private List<Transaction> transactionList=new ArrayList<>();
//@OneToMany(mappedBy = "card",cascade = CascadeType.ALL)
//    private List<Transaction> transactionList=new ArrayList<>();
@OneToMany(mappedBy = "card", cascade = CascadeType.ALL)
private List<Book> bookList=new ArrayList<>();

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}

