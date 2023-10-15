package com.example.demo;

import lombok.Builder;
import lombok.Getter;

@Getter
public class User {

    private int id;
    private String username;
    private String password;
    private String email;

    @Builder
    public User(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }
    
}
