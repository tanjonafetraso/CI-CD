package com.example.cicd.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/personne")
public class PersonneController {
    @GetMapping("/hello")
    public String hello(){
        return "Bonjour personne";
    }
}
