package com.example.hello.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hello.model.HelloResponse;
import com.example.hello.service.HelloService;

/**
 * REST Controller
 *
 * Role:
 * - Receives HTTP requests
 * - Calls Service layer
 * - Returns response to client
 *
 * Spring automatically converts HelloResponse to JSON.
 */
@RestController
public class HelloController {

    /**
     * Logger for tracking request flow
     */
    private static final Logger logger =
            LogManager.getLogger(HelloController.class);

    /**
     * Service dependency
     * Spring automatically injects HelloService
     */
    private final HelloService helloService;

    /**
     * Constructor Injection (recommended best practice)
     */
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    /**
     * HTTP GET endpoint
     *
     * URL:
     * http://localhost:8080/hello
     *
     * Returns HelloResponse object as JSON
     */
    @GetMapping("/hello")
    public HelloResponse hello() {

        logger.info("Received request for /hello");

        // Call service layer
        HelloResponse response = helloService.getHelloMessage();

        logger.info("Returning response");

        return response;
    }
}
