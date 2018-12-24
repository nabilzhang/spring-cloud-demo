/*
 * Copyright (C) 2017 Pingan, Inc. All Rights Reserved.
 */

package me.nabil.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.web.bind.annotation.RestController;

/**
 * HystrixDashBoard
 *
 * @author nabilzhang
 * @date 2017-09-14
 */
@SpringBootApplication
@RestController
@EnableHystrixDashboard
public class HystrixDashBoard {

    private static final Logger LOGGER = LoggerFactory.getLogger(HystrixDashBoard.class);


    public static void main(String[] args) {
        new SpringApplicationBuilder(HystrixDashBoard.class).web(WebApplicationType.SERVLET).run(args);
        LOGGER.info("HystrixDashBoard Ready!!!");
    }
}
