/*
 * Copyright (C) 2017 Pingan, Inc. All Rights Reserved.
 */

package me.nabil.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * client2
 *
 * @author nabilzhang
 * @date 2017-09-14
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaClient2 {

    private static final Logger LOGGER = LoggerFactory.getLogger(EurekaClient2.class);

    @GetMapping("/")
    public String home() {
        return "Hello world,client 2";
    }

    @GetMapping("/hello")
    public String hello(@RequestParam String param1) {
        LOGGER.info(">> hello, params:{}", param1);
        return "response:" + param1;
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaClient2.class).web(WebApplicationType.SERVLET).run(args);
    }
}
