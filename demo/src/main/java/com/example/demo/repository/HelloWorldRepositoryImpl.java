package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HelloWorldRepositoryImpl implements HelloWorldRepository{

    @Override
    public String getMessage() {
        return "Get Messages from Repository";
    }

    @Override
    public String putMessage() {
        return "Put messages from Repository";
    }

    @Override
    public String deleteMessage() {
        return "Delete Messages from Repository";
    }

    @Override
    public String postMessage() {
        return "Post Message from Repositorys";
    }

}
