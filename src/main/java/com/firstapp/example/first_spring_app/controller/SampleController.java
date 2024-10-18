package com.firstapp.example.first_spring_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample/apis")
public class SampleController {

    @GetMapping("/getSample")
    public String sampleApi(){
        return "Our first GET API";
    }

    @GetMapping("/getSample2")
    public String sampleApi2(){
        return "Our Second GET API";
    }

}
