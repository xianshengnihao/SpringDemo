package com.spring_01._10example.test;

import com.spring_01._10example.acttion.EmployeeActtion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applictionContext_01.xml")
public class _10exampleTest {

    @Autowired
    private ApplicationContext ctx;
    @Test
    public void test(){
        EmployeeActtion employeeActtion = ctx.getBean("emploeeActtion",EmployeeActtion.class);
        employeeActtion.execute();
    }
}
