package com.example.hello.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class HelloResponse {
	private String message;
    private String timestamp;
    private String serviceName;
}
