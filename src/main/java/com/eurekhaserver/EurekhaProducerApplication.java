package com.eurekhaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekhaProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekhaProducerApplication.class, args);
	}
}
