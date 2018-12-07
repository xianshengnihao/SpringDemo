package com.spring._08DI;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 依赖注入
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applictionContext.xml")
public class DItest {
    @Autowired
    private ApplicationContext ctx;
    @Test
    public void test(){
        SomeBean somebean = ctx.getBean("someBean",SomeBean.class);
        System.out.println(somebean);

    }
}
