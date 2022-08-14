package com.example.demo.service.impl;

import com.example.demo.repository.HelloWorldRepository;
import com.example.demo.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service // this annotation makes the pojo class into a bean
// creates an instance to this service and haves it ready
//@Qualifier(value = "com.demo.service.impl.HelloWorldService")
public class HelloWorldServiceImpl implements HelloWorldService {

    @Autowired
    HelloWorldRepository helloWorldRepository;

    @Override
    public String getMessage() {
        return helloWorldRepository.getMessage();
    }

    @Override
    public String putMessage() {
        return helloWorldRepository.putMessage();
    }

    @Override
    public String deleteMessage() {
        return helloWorldRepository.deleteMessage();
    }

    @Override
    public String postMessage() {
        return helloWorldRepository.postMessage();
    }
}
