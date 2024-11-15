package com.apress.AWS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloSpringBootApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	    return application.sources(HelloSpringBootApplication.class);
	}
	  
	public static void main(String[] args) {
		SpringApplication.run(HelloSpringBootApplication.class, args);
	}
	
	@RequestMapping("/")
	public String helloMessage() {
		return "Hello Spring Boot!";
	}
	
	@RequestMapping("/greeting")
	public String greetingMessage() {
		return "Welcome to Hello Spring Boot Application!";
	}

}
