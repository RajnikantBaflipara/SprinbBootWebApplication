package com.rajnish.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App 
{
	@GetMapping("/greeting")
	public String greetingMessage() {
		return "Waoo! Congrats Rajnikant Baflipara your application deployed successfully in Pivotal Cloud Foundry ";
	}
	
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
}
