/*
 * Copyright (C) 2017 Pingan, Inc. All Rights Reserved.
 */

package me.nabil.demo;

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

    @GetMapping("/")
    public String home() {
        return "Hello world,client 2";
    }

    @GetMapping("/hello")
    public String hello(@RequestParam String param1) {
        return "response:" + param1;
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaClient2.class).web(true).run(args);
    }
}
