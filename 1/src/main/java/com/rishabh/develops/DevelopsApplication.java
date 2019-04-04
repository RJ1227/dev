package com.rishabh.develops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DevelopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevelopsApplication.class, args);
	}

}
@RestController
class HomeController {

	@RequestMapping("/")
	String home()
	{
		return "HELLO WORLD";
	}
}
