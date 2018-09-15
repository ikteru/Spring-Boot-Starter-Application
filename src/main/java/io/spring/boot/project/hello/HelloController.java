package io.spring.boot.project.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hello";
	}
	@RequestMapping("/hi")
	public String sayHello() {
		return "Hi";
	}
}
