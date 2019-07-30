package com.rajnish.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App 
{
	private static final Logger LOGGER = LogManager.getLogger(App.class);
	@GetMapping("/greeting")
	public String greetingMessage() {
		LOGGER.info("Called Greeting Method....");
		return "Waoo! Congrats Rajnikant Baflipara your application deployed successfully in Pivotal Cloud Foundry.";
	}
	
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
}
