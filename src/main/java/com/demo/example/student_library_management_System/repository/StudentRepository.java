package com.demo.example.student_library_management_System.repository;

import org.hibernate.sql.ast.tree.expression.JdbcParameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.demo.example.student_library_management_System.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
