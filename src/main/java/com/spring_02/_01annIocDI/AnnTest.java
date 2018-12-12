package com.spring_02._01annIocDI;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Quailfier 配合Autowired使用 先按照bean类型去找，如果找到多个并且则在按照bean的id去找。
 * @Resource和@Autowired的注解的区别
 * @Resource 首先按照bean的id去找bean，如果找到就使用setter方式注入 没找到在按照bean类型去找
 * @Autowired 先按照bean类型去找，如果找到多个bean则在按照bean的id去找
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applictionContext_02.xml")
public class AnnTest {
//  @Resource
    @Autowired
    private SomeBean someBean;
    @Test
    public void Anntest(){
        someBean.getFooBean().sayFoobean();
        someBean.getOtherBean().sayOther();
    }
}
