package com.doctor.java.technologies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstAppApplication {

	public static void main(String[] args)
	{
		System.out.println("Spring Project Begin");
		SpringApplication.run(FirstAppApplication.class, args);
		System.out.println("Spring Project End");
	}

}
