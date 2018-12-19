package com.spring_02._04AOPbase._04CGlibProxy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/day2_appliction/04_AopBase-config.xml")
public class CGlibProxy {
    @Autowired
    private LogInvocationHandler logInvocationHandler;
    @Test
    public void test(){
        Enhancer enhancer = new Enhancer();
        enhancer.setClassLoader(this.getClass().getClassLoader());
        enhancer.setSuperclass(DataSource.class);
        enhancer.setCallback(logInvocationHandler);
        DataSource dataSource = (DataSource) enhancer.create();
        dataSource.executeQuery();
        dataSource.getConnection();


    }
}
