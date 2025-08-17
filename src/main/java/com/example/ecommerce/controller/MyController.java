package com.example.ecommerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ecommerce")
public class MyController {
    @GetMapping("greeting")
    public String test(){
        return "Welcome to the Elevatemycode";
    }
}
