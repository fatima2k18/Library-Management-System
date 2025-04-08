package com.demo.example.student_library_management_System.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.demo.example.student_library_management_System.model.Card;

@Repository
public interface CardRepository extends JpaRepository<Card, Integer> {
}
