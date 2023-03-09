package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/welcome")
    public String welcomeToCollage(){
        return "Welcome to our Collage!!";
    }
}
