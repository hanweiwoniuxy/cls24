package com.woniu.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BController {
    @GetMapping("/sayb")
    public String say(){
        System.out.println("hello");
        return "hello";
    }
}
