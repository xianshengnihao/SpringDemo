package com.spring_02._04AOPbase.test;

import com.spring_02._04AOPbase.dao.IEmployeeDao;
import com.spring_02._04AOPbase.domain.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/day2_appliction/04_AopBase-config.xml")
public class DecoratorTest {
    /**
     * 因为spring在自动创建bean的时候创建了俩个类型都为IEmployeeDao
     * 的bean（EmployeeDaoImpl和EmployeeDaoWrapper）所以在自动注入
     * 的时候需要加Qualifier注解，spring自动创建bean时默认给bean的名字为该类名的首字母小写
     * 见下面的@Qualifier
     */
    @Autowired
    @Qualifier("employeeDaoWrapper")
    private IEmployeeDao employeeDao;
    @Autowired Employee employee;
    @Test
    public void test(){
        System.out.println("开始");
        employeeDao.save(employee);
    }
}
