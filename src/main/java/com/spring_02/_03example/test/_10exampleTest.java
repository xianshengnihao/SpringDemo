package com.spring_02._03example.test;

import com.spring_02._03example.acttion.EmployeeActtion;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/day2_appliction/03_example-config.xml")
public class _10exampleTest {
    public static Logger logger = Logger.getLogger(_10exampleTest.class);
    @Autowired
    private EmployeeActtion employeeActtion;
    @Test
    public void test(){
        logger.debug(employeeActtion.execute());
    }
}
