package com.spring_02._02annIOC;

import org.springframework.stereotype.Component;

@Component          //加了该注解spring在扫包的时候就会在容器中自动创建该bean
public class OtherBean {
   String sayOther(){
       System.out.println("我是OtherBean");
       return "我是OtherBean";
    }
}
