package com.spring_02._06AnnAop;

import com.spring_02._06AnnAop.dao.ITarget;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: hwg
 * @Date: Create in 2019/6/21
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/AnnAopContext.xml")
public class AnnAopTest {

    @Autowired
    public ITarget target;
    @Test
    public void AnnAoptest(){
        target.somethin();
    }
}
