package com.xyzcorp.digital.eureka.loadbalancer.eurekaloadbalancer.config;

import java.time.Duration;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class EurekaConfig {
    
    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
    
        return new RestTemplate();
    }
}