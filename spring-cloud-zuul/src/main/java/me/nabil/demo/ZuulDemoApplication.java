/*
 * Copyright (C) 2017 Pingan, Inc. All Rights Reserved.
 */

package me.nabil.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * ZuulApplication
 *
 * @author nabilzhang
 * @date 2017-09-14
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulDemoApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(ZuulDemoApplication.class);

    public static void main(String[] args) {
        new SpringApplicationBuilder(ZuulDemoApplication.class).web(WebApplicationType.SERVLET).run(args);
        LOGGER.info("ZuulApplication Ready!!!");
    }
}
