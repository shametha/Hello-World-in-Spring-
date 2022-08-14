package com.example.demo.controller;

import com.example.demo.service.HelloWorldService;
import com.example.demo.service.impl.HelloWorldServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController // makes the class from a POJO to a Bean
public class HelloWorldController {

    @Autowired
    HelloWorldService helloWorldService ;

    @GetMapping(value = "/") // root url
    public String getMessage(){

        return helloWorldService.getMessage();
    }

    @DeleteMapping(value = "/") // root url
    public String deleteMessage(){
        return helloWorldService.deleteMessage();
    }

    @PostMapping(value = "/") // root url
    public String putMessage(){
        return helloWorldService.putMessage();
    }

    @PutMapping(value = "/") // root url
    public String updateMessage(){
        return helloWorldService.putMessage();
    }


}
