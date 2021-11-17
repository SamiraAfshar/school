package com.samiral.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@SpringBootApplication
public class SchoolApplication {


	public static void main(String[] args) {
		SpringApplication.run(SchoolApplication.class, args);

	}

//	@GetMapping("hello")
//	public String helloworld(){
//		return "hellooworld";
//	}

}
