package com.spring_02._02annIOC;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applictionContext_02.xml")
public class IOCTest {
    private static Logger logger= Logger.getLogger(IOCTest.class);
    @Autowired
    private SomeBean someBean;
    @Test
    public void test(){

        logger.info(someBean.getOtherBean().sayOther());
    }
}
