package com.bankcontrol.bankcontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BankControlApplication {

	@GetMapping("/oi")
	public String ola(){
		return "ola";
	}

	public static void main(String[] args) {
		SpringApplication.run(BankControlApplication.class, args);
	}

}
