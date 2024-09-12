package com.example.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class DockerApplication {

	 @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

	public static void main(String[] args) {
		SpringApplication.run(DockerApplication.class, args);
	}

}
