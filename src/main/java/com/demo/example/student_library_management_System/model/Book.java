package com.demo.example.student_library_management_System.model;
import com.demo.example.student_library_management_System.enums.Category;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="book")
public class Book {
    //id, title.pages, publisherName, publishedDate, genere(Category), rackNo, availability(true or false)
    @Id // PRIMARY KEY
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment ID
    @Column(name="id", nullable = false)
    private int id;
  @Column(name="title", nullable = false)
    private  String title;
   @Column(name="pages",nullable = false)
    private int pages;
   @Column(name="punblisherName", nullable = false)
   private String publisherName;
   @Column(name="PublishedDate", nullable = false)
   private String PublishedDate;
   @Column(name="category", nullable = false)

    @Enumerated(value = EnumType.STRING)
    private Category category;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getPublishedDate() {
        return PublishedDate;
    }

    public void setPublishedDate(String publishedDate) {

        PublishedDate = publishedDate;
    }

    public Category getCategory() {

        return category;
    }

    public void setCategory(Category category) {

        this.category = category;
    }

    public String getRackNo() {
        return rackNo;
    }

    public void setRackNo(String rackNo) {
        this.rackNo = rackNo;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Column(name="rack_no", nullable=false)
    private String rackNo;
    @Column(name="availability", nullable = false)
    private boolean availability;

    @JoinColumn
    @ManyToOne
    private Author author;

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    @OneToMany(mappedBy="book", cascade = CascadeType.ALL)
    private List<Transaction> transactionList=new ArrayList<>();

    @ManyToOne
    @JoinColumn
    private Card card;

}
