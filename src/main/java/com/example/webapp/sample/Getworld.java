package com.example.webapp.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Getworld {
	
	@GetMapping("hello")
	public String get() {
		return "Hello World";
	}

}
