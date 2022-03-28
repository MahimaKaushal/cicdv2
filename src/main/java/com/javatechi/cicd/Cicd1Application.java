package com.javatechi.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/hello")
@SpringBootApplication
public class Cicd1Application {

	@GetMapping("/cicd")
	public String hl() {
		return "hi cicd application";
	}
	public static void main(String[] args) {
		SpringApplication.run(Cicd1Application.class, args);
	}

}
