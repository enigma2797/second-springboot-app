package com.sample.springBootApp.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class HomeContoller {

    @GetMapping("/")
    public String getMethodName() {
        return "Application is running";
    }
    

}
