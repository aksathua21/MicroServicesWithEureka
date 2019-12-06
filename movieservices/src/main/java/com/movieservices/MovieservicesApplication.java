package com.movieservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MovieservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieservicesApplication.class, args);
	}

}
