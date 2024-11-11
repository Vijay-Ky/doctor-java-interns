package com.doctorjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleRestControllerWithDevToolsApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(SimpleRestControllerWithDevToolsApplication.class, args);
		System.out.println("Hello from Spring");
	}
}
