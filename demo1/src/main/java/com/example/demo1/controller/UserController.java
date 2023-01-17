package com.example.demo1.controller;

import com.example.demo1.controller.response.UserResponse;
import com.example.demo1.domain.User;
import com.example.demo1.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/users")
    public List<UserResponse> getUser() throws InterruptedException {
        List<UserResponse> users = userService.findUsers();
        return users;
    }

    @DeleteMapping("/users")
    public void deleteAllUser() {
        userService.deleteAllUser();
    }
}
