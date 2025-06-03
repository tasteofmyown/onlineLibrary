package com.example.uni_library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class UniLibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniLibraryApplication.class, args);
		System.out.println("-----Applicatin running-----");

	}

}
