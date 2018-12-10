package com.spring.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applictionContext.xml")
public class Somebean {

    void sayhi(){
        System.out.printf("haha");
    }
    /**
     * 通过ApplictionContext容器手动启动，并且从中获取一个bean
     */
//    @Test
//    public void test(){
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("applictionContext.xml");
//        Somebean somebean = ctx.getBean("Somebean",Somebean.class);
//        somebean.sayhi();
//    }

    /**
     * 自动启动BeanFactory容器
     */
    @Autowired
    private BeanFactory beanFactory;
    /**
     * 自动启动ApplictionContext容器
     *
     * 其实ApplictionContext和BeanFactory的同期创建是同一个容器。
     */
    @Autowired
    private ApplicationContext ctx;
    @Test
    public void test2(){
        Somebean somebean = ctx.getBean("Somebean1",Somebean.class);
        Somebean somebean1 = beanFactory.getBean("Somebean1",Somebean.class);
        System.out.println(somebean);
        System.out.println(somebean1);
        System.out.println(ctx.getClass().getName());
        System.out.println(beanFactory.getClass().getName());
        somebean.sayhi();

    }

}
