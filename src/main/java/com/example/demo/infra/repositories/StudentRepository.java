package com.example.demo.infra.repositories;

import com.example.demo.core.student.Student;

import org.springframework.stereotype.Repository;

import javax.management.remote.SubjectDelegationPermission;

import com.example.demo.core.student.IStudentRepository;

@Repository
public class StudentRepository implements IStudentRepository{
    
    @Override
    public Student createStudent(Student student) {
        return student;
    }
    
}
