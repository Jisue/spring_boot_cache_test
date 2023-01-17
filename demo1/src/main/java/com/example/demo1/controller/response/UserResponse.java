package com.example.demo1.controller.response;

// Data Transfer Object

import lombok.Builder;
import lombok.Getter;

@Getter
public class UserResponse {
    private Long id;
    private String surName; // 성
    private String name; // 이름

    @Builder // 생성자를 명확하게 하기 위해서
    public UserResponse(Long id, String surName, String name) {
        this.id = id;
        this.surName = surName;
        this.name = name;
    }
}
