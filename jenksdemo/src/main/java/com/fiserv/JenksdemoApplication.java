package com.fiserv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenksdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenksdemoApplication.class, args);
		System.out.println("Hello Jenkins!");
	}

}
