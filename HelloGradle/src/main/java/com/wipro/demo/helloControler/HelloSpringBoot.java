package com.wipro.demo.helloControler;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringBoot {
	@PostMapping(value= "/api")
	public String HelloGradle() {
		System.out.println("Hello spring Boot");
		return "welocome to Spring Boot";
	}

}
