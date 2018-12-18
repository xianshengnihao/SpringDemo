package com.spring_02._04AOPbase._03JDKProxy;

import com.spring_02._04AOPbase.dao.IEmployeeDao;
import com.spring_02._04AOPbase.domain.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.lang.reflect.Proxy;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/day2_appliction/04_AopBase-config.xml")
@Component
public class JdkProxyTest {
    @Autowired
    private MyInvocationHandler myInvocationHandler;
    @Autowired
    private Employee employee;

    @Test
    public void test() {
        ClassLoader classLoader = this.getClass().getClassLoader();     //类加载器
        /**
         *  通过调用代理类（Proxy）下的newProxyInstance方法
         */
        IEmployeeDao employeeDao = (IEmployeeDao) Proxy.newProxyInstance(classLoader, new Class[]{IEmployeeDao.class}, myInvocationHandler);
//            employeeDao.save(employee);
        Employee employe2 = employeeDao.get();
        System.out.println(employe2);
    }
}
