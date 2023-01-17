package com.example.demo1.domain;

import com.example.demo1.controller.response.UserResponse;
import lombok.Builder;
import lombok.Getter;

@Getter // getter 메소드를 자동으로 생성
public class User {
    private Long id;
    private String fullName;

    @Builder
    public User(Long id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public UserResponse toResponse() {
        return UserResponse.builder()
                .id(this.getId())
                .surName(this.getFullName().substring(0, 1))
                .name(this.getFullName().substring(1))
                .build();
    }
}
