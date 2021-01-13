package com.szewczyk.cdtest;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/db")
public class HelloWorld {

    @GetMapping("/hello")
    public String helloWorld(){
        return "hello world";
    }
}
