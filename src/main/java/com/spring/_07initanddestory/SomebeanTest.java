package com.spring._07initanddestory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * bean的初始换和销毁
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applictionContext.xml")
public class SomebeanTest {
    @Autowired
    private ApplicationContext ctx;
    @Test
    public void test(){
        Somebean somebean = ctx.getBean("someBean",Somebean.class);
        somebean.sayhi();
    }


}
