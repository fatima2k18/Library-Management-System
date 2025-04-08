

package com.demo.example.student_library_management_System.converters;

import com.demo.example.student_library_management_System.model.Author;

import com.demo.example.student_library_management_System.requestdto.AuthorRequestDto;

public class AuthorConverters {

    public static Author convertAuthorRequestDtoIntoAuthor(AuthorRequestDto authorRequestDto) {
        Author author = new Author();
       author.setName(authorRequestDto.getName());
       author.setEmail(authorRequestDto.getEmail());
       author.setCountry(authorRequestDto.getCountry());
       author.setRating(authorRequestDto.getRating());
       author.setGender(authorRequestDto.getGender());


        return author;
    }

}
