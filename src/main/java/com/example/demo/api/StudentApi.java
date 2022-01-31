package com.example.demo.api;

import com.example.demo.core.student.Student;
import com.example.demo.services.student.StudentCreateDto;
import com.example.demo.services.student.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="students")
public class StudentApi {
    private final StudentService studentService;
    
    @Autowired
    public StudentApi(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/")
    public ResponseEntity<Student> createStudent(@RequestBody StudentCreateDto studentCreateDto) {
        Student student = studentService.createStudent(studentCreateDto);

        return ResponseEntity.status(201)
            .body(student);
    }
}
