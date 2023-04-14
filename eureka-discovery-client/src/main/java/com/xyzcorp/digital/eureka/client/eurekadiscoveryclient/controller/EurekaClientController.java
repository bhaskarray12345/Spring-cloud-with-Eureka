package com.xyzcorp.digital.eureka.client.eurekadiscoveryclient.controller;

import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaClientController {

    @Autowired
    private ServletWebServerApplicationContext webServerAppCtxt;

    @GetMapping("/api/hello")
    public int helloWorld(){
        int port = (webServerAppCtxt.getWebServer().getPort());
        return port;
    }
}
