package com.simplilearn.workshop.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingResource {
	
	//URI ----- localhost:8080/
	@RequestMapping("/hello")
	public String greetings() {
		return "Hello ! Spring Boot";
	}

}
