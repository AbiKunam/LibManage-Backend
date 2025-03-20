package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @GetMapping("/test")
    public String initial(){
        return "Api is working";
    }

    @PostMapping("/")
    public User adddata(@RequestBody User userdata){
        return userdata;
    }
}

class User{
    public String name;
    public String email;
    public int age;
}
