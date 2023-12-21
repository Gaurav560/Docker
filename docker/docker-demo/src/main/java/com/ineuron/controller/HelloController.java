package com.ineuron.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String returnHelloWorld() {
		return "Welcome Gaurav to Hello World";
	}
}
