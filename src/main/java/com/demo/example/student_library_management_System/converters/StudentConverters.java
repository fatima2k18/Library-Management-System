package com.demo.example.student_library_management_System.converters;

import com.demo.example.student_library_management_System.model.Student;
import com.demo.example.student_library_management_System.requestdto.StudentRequestDto;

public class StudentConverters {

    public static Student convertStudentREquestDtoIntoStudent(StudentRequestDto studentRequestDto) {
        Student student = new Student();
        student.setName(studentRequestDto.getName());
        student.setGender(studentRequestDto.getGender());
        student.setDob(studentRequestDto.getDob());
        student.setMobile(studentRequestDto.getMobile());
        student.setEmail(studentRequestDto.getEmail());
        student.getAddress(studentRequestDto.getAddress());
        student.setDept(studentRequestDto.getDept());
        student.setSem(studentRequestDto.getSem());

        return student;
    }

}
