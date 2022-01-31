package com.example.demo.services.student;

import com.example.demo.core.student.Student;
import com.example.demo.infra.repositories.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(StudentCreateDto studentCreateDto) {

        Student student = new Student(studentCreateDto.getName(), studentCreateDto.getPhoneNumber());

        return studentRepository.createStudent(student);
    }
}
