package com.example.DemoBackend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloTesting {

	@GetMapping("/api/java.html")
	public String helloWorld() {
		return "Hello World";
	}
	
	
}
