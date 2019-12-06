package com.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Discovery1Application {

	public static void main(String[] args) {
		SpringApplication.run(Discovery1Application.class, args);
	}

}
