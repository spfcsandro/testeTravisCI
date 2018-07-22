package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TesteTravisCiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteTravisCiApplication.class, args);
		System.out.println("Teste TravisCI");
	}
}
