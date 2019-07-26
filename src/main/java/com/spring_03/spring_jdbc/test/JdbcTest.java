package com.spring_03.spring_jdbc.test;

import com.spring_03.spring_jdbc.Dao.IprojectDao;
import com.spring_03.spring_jdbc.Project;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Author: hwg
 * @Date: Create in 2019/7/3
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/JdbcContext.xml")
public class JdbcTest {
    @Autowired
    private IprojectDao dao;

    @Test
    public void dataTest(){
        Project project = new Project();
        project.setId(4+0l);
        project.setName("hw789");
        dao.save(project);
        dao.update(project);
    }
}
