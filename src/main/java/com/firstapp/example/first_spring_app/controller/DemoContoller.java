package com.firstapp.example.first_spring_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo/apis")
public class DemoContoller {

    @GetMapping("/getSample")
    public String sampleApi(){
        return "Our first GET API";
    }

}
