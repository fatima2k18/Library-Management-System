package com.demo.example.student_library_management_System.model;

import jakarta.persistence.*;

@Entity
@Table(name = "student")

public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
@Column(name = "name",nullable = false)
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

   @Column(name = "email",nullable = false,unique = true)
   private String email;
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
   @Column(name = "gender", nullable = false)
    private String  gender;
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    @Column(name = "dob",nullable = false)
    private String dob;

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
   @Column(name = "mobile", nullable = false)
    private String mobile;
    public String getMobile() {
        return mobile;
    }
@Column(name = "mobile",nullable = false)
    public void setMobile(String mobile) {
    this.mobile = mobile;
}
@Column(name = "address",nullable = false)
private String address;
    public String getAddress(String address) {
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
@Column(name = "sem",nullable = false)
    private String sem;
    public String getSem() {
        return sem;
    }
    public void setSem(String sem) {
        this.sem = sem;
    }
 @Column(name = "dept", nullable = false)
   private String dept;

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL) //cascadeType.ALL - whatever(add/delete) operations
    private Card card;
}