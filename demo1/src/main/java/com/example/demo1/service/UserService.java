package com.example.demo1.service;

import com.example.demo1.domain.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

@Service
public class UserService {

    public Map<Long, User> users = new ConcurrentHashMap<>();

    @Cacheable(cacheNames = "users")
    @PostConstruct // WAS가 띄워질 때 실행
    public void init() {
        User user1 = User.builder()
                .id(1L)
                .name("user1")
                .build();
        User user2 = User.builder()
                .id(2L)
                .name("user2")
                .build();
        User user3 = User.builder()
                .id(3L)
                .name("user3")
                .build();

        users.put(user1.getId(), user1);
        users.put(user2.getId(), user2);
        users.put(user3.getId(), user3);
    }

    public List<User> getUserList() {
        Set<Long> userIds = users.keySet();

        return userIds.stream()
                .map(userId -> users.get(userId))
                .collect(Collectors.toList());
    }
}
