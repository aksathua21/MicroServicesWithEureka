package com.ratingdataservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RatingdataserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RatingdataserviceApplication.class, args);
	}

}
