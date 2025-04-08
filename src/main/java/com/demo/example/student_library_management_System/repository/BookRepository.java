package com.demo.example.student_library_management_System.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.demo.example.student_library_management_System.model.Book;
@Repository

public interface BookRepository extends JpaRepository<Book, Integer> {

}
