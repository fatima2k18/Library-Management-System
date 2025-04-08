
package com.demo.example.student_library_management_System.converters;
import com.demo.example.student_library_management_System.model.Book;
import com.demo.example.student_library_management_System.requestdto.BookRequestDto;
public class BookConverters {
    public static Book convertBookRequestDtoIntoBook(BookRequestDto bookRequestDto) {

        Book book = new Book();

        book.setTitle(bookRequestDto.getTitle());

        book.setRackNo(bookRequestDto.getRackNo());

        book.setPages(bookRequestDto.getPages());

        book.setPublisherName(bookRequestDto.getPublisherName());

        book.setPublishedDate(bookRequestDto.getPublishedDate());

        book.setAvailability(bookRequestDto.isAvailability());

        book.setCategory(bookRequestDto.getCategory());
        return book;
    }

    }

