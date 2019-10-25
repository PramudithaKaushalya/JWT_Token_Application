package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( "/jwt" )
public class HelloController {
    
    @GetMapping( "/hello" )
    public String firstPage() {
        return "Hello World!!!";
    }

}