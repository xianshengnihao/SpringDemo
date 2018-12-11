package com.spring_01.service.Impl;

import com.spring_01.service.IHelloService;

public class HelloServiceImpl implements IHelloService {
    public void sayHi() {
        System.out.printf("Hello Spring");
    }
}
