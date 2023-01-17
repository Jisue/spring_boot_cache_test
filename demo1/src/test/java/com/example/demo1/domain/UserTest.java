package com.example.demo1.domain;

import com.example.demo1.controller.response.UserResponse;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.jupiter.api.Assertions.*;

class UserTest { // 단위 테스트

    @Test
    void User는_UserResponse로_변환이_잘_되어야_한다() {
        //given
        User user = User.builder()
                .id(1L)
                .fullName("김지수")
                .build();

        //when
        UserResponse result = user.toResponse();

        //then
        assertEquals(result.getSurName(), "김");
        assertEquals(result.getName(), "지수");

        // 클래스가 UserResponse클래스인지 확인해보기
        // junit assert class type
        assertThat(result, instanceOf(UserResponse.class));
    }
}