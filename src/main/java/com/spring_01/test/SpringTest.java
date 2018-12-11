package com.spring_01.test;

import com.spring_01.service.IHelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//加载配置文件

@ContextConfiguration("classpath:applictionContext_01.xml")
public class SpringTest {
    @Autowired
    private BeanFactory beanFactory;

    @Test
    public void test() {
        HelloTestImpl helloTest = beanFactory.getBean("test", HelloTestImpl.class);
        helloTest.HelloTest();
        IHelloService helloService = (IHelloService) beanFactory.getBean("Hello");
        System.out.println(helloService);
//      helloService.sayHi();
    }
}
