package com.example.demo.core.student;

import java.rmi.server.UID;
import java.util.UUID;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
public class Student {
    
    private String id;
    private String name;
    private String phoneNumber;

    public Student(String name, String phoneNumber) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}
