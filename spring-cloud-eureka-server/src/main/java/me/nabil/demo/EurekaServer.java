/*
 * Copyright (C) 2017 Pingan, Inc. All Rights Reserved.
 */

package me.nabil.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eurekaServer
 *
 * @author nabilzhang
 * @date 2017-09-14
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaServer.class).run(args);
    }
}
