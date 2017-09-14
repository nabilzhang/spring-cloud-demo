/*
 * Copyright (C) 2017 Pingan, Inc. All Rights Reserved.
 */

package me.nabil.demo;

import org.springframework.stereotype.Component;

/**
 * @author zhangbi617
 * @date 2017-09-14
 */
@Component
public class Client2ServiceFallback implements Client2Service {
    @Override
    public String hello(String param1) {
        return "2不见了";
    }
}
