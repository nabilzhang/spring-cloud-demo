/*
 * Copyright (C) 2017 Pingan, Inc. All Rights Reserved.
 */

package me.nabil.demo;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author nabilzhang
 * @date 2017-09-14
 */
@FeignClient("client2")
public interface Client2Service {

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    String hello(@RequestParam(value = "param1") String param1);
}
