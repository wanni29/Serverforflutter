package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public ResponseEntity<?> userList() {
        System.out.println("엔드 포인트 user에 진입!");

        List<User> userList = new ArrayList<>();
        userList.add(new User(1, "ssar", "1234",  "ssar@nate.com"));
        userList.add(new User(2, "cos", "1234",  "cos@nate.com"));
        userList.add(new User(3, "love", "1234",  "love@nate.com"));
        return ResponseEntity.ok().body(userList);
    }

    @GetMapping("/user/1")
    public ResponseEntity<?> user() {
        System.out.println("엔드 포인트 user/1에 진입!");

        return ResponseEntity.ok().body(new User(1, "ssar", "1234", "ssar@nate.com"));
    }
    
}
