package com.xyzcorp.digital.eureka.loadbalancer.eurekaloadbalancer.controller;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EurekaLoadBalancerController {
    
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/api/geteurekaclient")
    public int getEurekaClientInstance(){

        URI uri = null;
        try {
            uri = new URI("http://my-client-app/api/hello");
        } catch (URISyntaxException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return restTemplate.getForObject(uri, Integer.class);
    }
}
