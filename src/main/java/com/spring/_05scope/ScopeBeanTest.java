package com.spring._05scope;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * spring控制生命周期
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applictionContext.xml")
public class ScopeBeanTest {
    @Autowired
    private ApplicationContext ctx;

    /**
     * spring中的bean创建是默认为单例的，既同一个对象只创建一次。bean的配置scope默认为scope="singleton"
     * singleton：既同一个对象只创建一次
     * prototype: 既每次getBean同一个Bean都会创建一个不同的实例，用一次对象创建一次
     * 在web环境中，持久层和业务层的对象对象一般都是单例的，既同一个对象只创建一次
     */
    @Test
    public void testScope(){
        ScopeBean scopeBean = ctx.getBean("scopeBean",ScopeBean.class);
        ScopeBean scopeBean2 = ctx.getBean("scopeBean",ScopeBean.class);
        System.out.println(scopeBean==scopeBean2);
    }


}
