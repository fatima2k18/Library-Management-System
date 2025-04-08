package com.demo.example.student_library_management_System.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.example.student_library_management_System.model.Author;
import org.springframework.stereotype.Repository;

    public interface AuthorRepository extends JpaRepository<Author, Integer>{

    }
