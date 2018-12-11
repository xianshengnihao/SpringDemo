package com.spring_01._09constructors;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applictionContext_01.xml")
public class BeanTest {

    @Autowired
    ApplicationContext ctx;

    /**
     * 构造器注入
     */
    @Test
    public void test(){
        ConstructorsBean constructorsBean = ctx.getBean("someBean4",ConstructorsBean.class);
        System.out.println(constructorsBean);
    }
}
