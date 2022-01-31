package com.example.demo.services.student;

import javax.validation.constraints.NotBlank;

import lombok.Getter;

@Getter
public class StudentCreateDto {
    @NotBlank()
    private String name;
    private String phoneNumber;

    public StudentCreateDto(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }
}
