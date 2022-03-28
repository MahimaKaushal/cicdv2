package com.javatechi.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/hello")
public class Controller {

	@GetMapping("/cicd")
	public String hl() {
		return "hi cicd application";
	}

}
