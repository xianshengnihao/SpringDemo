package com.spring_02._03example.test;

import com.spring_02._03example.acttion.EmployeeActtion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:com/spring_02/_03example/03_example-config.xml")
public class _10exampleTest {

    @Autowired
    private EmployeeActtion employeeActtion;
    @Test
    public void test(){
        employeeActtion.execute();
    }
}
