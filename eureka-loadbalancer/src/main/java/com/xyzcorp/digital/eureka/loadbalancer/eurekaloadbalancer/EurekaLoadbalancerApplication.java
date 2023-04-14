package com.xyzcorp.digital.eureka.loadbalancer.eurekaloadbalancer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaLoadbalancerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaLoadbalancerApplication.class, args);
	}

}
