package com.example.cicd.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Teste {
    @GetMapping("/version")
    public String teste(){
        return "Version 2.0";
    }
}
