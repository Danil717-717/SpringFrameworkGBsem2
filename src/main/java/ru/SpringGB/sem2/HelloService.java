package ru.SpringGB.sem2;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String getGreeting(){
        return "Hello, world!";
    }
}
