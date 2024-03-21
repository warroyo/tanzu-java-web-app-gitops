package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloController {

	@GetMapping("/")
	public String index(HttpServletRequest request) {
		return "Greetings from Spring Boot + Tanzu multicloud! Clientt IP is "+  request.getRemoteAddr();
	}

}
