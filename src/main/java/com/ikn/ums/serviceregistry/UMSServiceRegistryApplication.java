package com.ikn.ums.serviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class UMSServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(UMSServiceRegistryApplication.class, args);
	}

}
