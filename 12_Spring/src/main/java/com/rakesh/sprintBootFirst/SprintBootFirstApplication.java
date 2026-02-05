package com.rakesh.sprintBootFirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class SprintBootFirstApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SprintBootFirstApplication.class, args);
		System.out.println("Hello world!");

		Alien obj = context.getBean(Alien.class);
		obj.code();
	}
		
}
