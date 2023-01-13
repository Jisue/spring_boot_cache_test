package com.example.demo1.domain;

import lombok.Builder;
import lombok.Getter;

@Getter // getter 메소드를 자동으로 생성
public class User {
    private Long id;
    private String name;

    @Builder
    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
