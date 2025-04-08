package com.demo.example.student_library_management_System.requestdto;

import com.demo.example.student_library_management_System.enums.CardStatus;

public class CardRequestDto {
    private CardStatus cardStatus;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    private int studentId;

    public CardStatus getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }
}
