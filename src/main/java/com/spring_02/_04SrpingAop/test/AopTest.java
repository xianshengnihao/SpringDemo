package com.spring_02._04SrpingAop.test;

import com.spring_02._04AOPbase.domain.Employee;
import com.spring_02._04SrpingAop.dao.IEmployeeDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/day2_appliction/04_AopSpringAop-config.xml")

public class AopTest {
    @Resource
    private IEmployeeDao employeeDao;

    @Test
    public void test(){
        System.out.println(employeeDao.getClass().getName());
        employeeDao.save(new Employee());
    }

}
