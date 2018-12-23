/*
 * Copyright (C) 2017 Pingan, Inc. All Rights Reserved.
 */

package me.nabil.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * client1
 *
 * @author nabilzhang
 * @date 2017-09-14
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
@EnableFeignClients
@EnableCircuitBreaker
public class EurekaClient1 {

    private static final Logger LOGGER = LoggerFactory.getLogger(EurekaClient1.class);

    @Autowired
    private Client2Service client2Service;

    @RequestMapping("/")
    public String home() {
        LOGGER.info("excute home");
        return "Hello world" + client2Service.hello("client1");
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaClient1.class).web(WebApplicationType.SERVLET).run(args);
    }
}
