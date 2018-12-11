package com.spring_01._06scope;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applictionContext_01.xml")
public class CreationBeanBeanTest {

    @Autowired
    private ApplicationContext ctx;

    @Test
    public void creationTest(){
        /**
         * 默认的spring以无参构成方法创建bean对象
         */
        CreationBean creationBean1 = ctx.getBean("creationBean",CreationBean.class);
        System.out.println(creationBean1);

        /**
         * 通过CreationBeanFactory中的  静态  方法getCreation1()创建
         * Creation对象name="getCreation1"映射的是CreationBeanFactory类，
         * CreationBeanFactory中的构造方法返回了Creation对象具体看配置文件
         */
        CreationBean creationBean2 = ctx.getBean("getCreation1",CreationBean.class);
        System.out.println(creationBean2);
        /**
         * 通过CreationBeanFactory中的普通方法getCreation2()创建Creation对象
         */
        CreationBean creationBean3 = ctx.getBean("creationBean3",CreationBean.class);
        System.out.println(creationBean3);
        /**
         * 通过实现FactoryBean接口创建Creation
         */
        CreationBean creationBean4 = ctx.getBean("creationFactoryBean",CreationBean.class);
        System.out.println(creationBean4);


    }
}
