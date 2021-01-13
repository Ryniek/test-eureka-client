package com.szewczyk.cdtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.CrossOrigin;

@Controller
@CrossOrigin
@RequestMapping("/db")
public class HelloWorld {

    @GetMapping("/hello")
    public String helloWorld(){
        return "hello world";
    }
}
