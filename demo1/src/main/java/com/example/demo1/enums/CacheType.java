package com.example.demo1.enums;

import lombok.Getter;

@Getter
public enum CacheType {
    USERS(
            "users",      // 캐시 이름: users
            5 * 60,   // 만료 시간: 5 분
            10000       // 최대 갯수: 10000
    );

    CacheType(String cacheName, int expireAfterWrite, int maximumSize) {
        this.cacheName = cacheName;
        this.expireAfterWrite = expireAfterWrite;
        this.maximumSize = maximumSize;
    }

    private final String cacheName;
    private final int expireAfterWrite;
    private final int maximumSize;

}