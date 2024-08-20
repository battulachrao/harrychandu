package com.example.docker16082024.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlle {

    @GetMapping("/test")
    public String hi(){
        return "hi chandra";
    }

}

