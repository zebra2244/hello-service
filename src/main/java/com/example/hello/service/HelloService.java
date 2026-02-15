package com.example.hello.service;

import java.time.LocalDateTime;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.example.hello.model.HelloResponse;

@Service
public class HelloService {

    private static final Logger logger = LogManager.getLogger(HelloService.class);

    public HelloResponse getHelloMessage() {

        logger.info("HelloService.getHelloMessage() invoked");

        HelloResponse response = new HelloResponse();
        response.setMessage("Hello World from Service Layer");
        
        response.setTimestamp(LocalDateTime.now().toString());
        
        logger.debug("Response created with timestamp: {}", response.getTimestamp());

        return response;
    }
}
