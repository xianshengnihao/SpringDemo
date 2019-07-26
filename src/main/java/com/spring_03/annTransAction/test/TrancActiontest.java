package com.spring_03.annTransAction.test;

import com.spring_03.annTransAction.Service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;

/**
 * @Author: hwg
 * @Date: Create in 2019/7/3
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/AnntransActionContext.xml")
public class TrancActiontest {
    @Autowired
    private AccountService accountService;

    @Test
        public void dataTest(){
        BigDecimal big = new BigDecimal("200.00");
        accountService.transfer(1001L,1002L,big);
    }
}
