package com.eoi.entidades;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MySpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringBootApplication.class, args);
	}


	@RequestMapping("/hola")
	String hellow() {
		return "Hellooooou World";
	}
	@RequestMapping("/gif")
	String gif() {
		return "<IMG SRC=\"https://educacion30.b-cdn.net/wp-content/uploads/2019/06/homer.gif\">";
	}

}

