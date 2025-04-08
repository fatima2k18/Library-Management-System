package com.demo.example.student_library_management_System.converters;

import com.demo.example.student_library_management_System.model.Card;
import com.demo.example.student_library_management_System.model.Student;
import com.demo.example.student_library_management_System.requestdto.CardRequestDto;
import com.demo.example.student_library_management_System.requestdto.StudentRequestDto;

public class CardConverters {
    //converter-used to convert the request dto inputs into model class which saves in database
    public static Card convertRequestDtoIntoCard(CardRequestDto cardRequestDto){
        Card card=new Card();
        card.setCardStatus(cardRequestDto.getCardStatus());
        return card;
    }
}
