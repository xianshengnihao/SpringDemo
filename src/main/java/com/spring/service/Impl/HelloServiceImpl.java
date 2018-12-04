package com.spring.service.Impl;

import com.spring.service.IHelloService;

public class HelloServiceImpl implements IHelloService {
    public void sayHi() {
        System.out.printf("Hello Spring");
    }
}
