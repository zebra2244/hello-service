package com.example.hello.controller;

import com.example.hello.config.AppProperties;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
	
	private final AppProperties appProperties;
	
	public HelloController(AppProperties appProperties) {
        this.appProperties = appProperties;
    }

	
	@GetMapping("/hello")
	public String hello() {
        return appProperties.getMessage();
    }
	
}
