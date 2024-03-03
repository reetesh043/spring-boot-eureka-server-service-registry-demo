package com.example.reet.service.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringBootEurekaServiceRegistryDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaServiceRegistryDemoApplication.class, args);
	}

}
