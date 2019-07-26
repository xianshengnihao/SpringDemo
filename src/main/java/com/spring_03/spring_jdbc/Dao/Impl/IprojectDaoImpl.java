package com.spring_03.spring_jdbc.Dao.Impl;

import com.spring_03.spring_jdbc.Dao.IprojectDao;
import com.spring_03.spring_jdbc.Project;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;
import java.util.Random;

/**
 * @Author: hwg
 * @Date: Create in 2019/7/2
 */
public class IprojectDaoImpl implements IprojectDao {
    private JdbcTemplate template;
    public void setDataSource(DataSource dataSource){
        this.template=new JdbcTemplate(dataSource);

    }

    @Override
    public void save(Project p) {

        String sql="INSERT INTO " +
                           "t_user(user_id,user_name, " +
                           "credits, password, " +
                           "last_visits, last_ip) VALUES (5, (?), NULL, (?), NULL, NULL)";

        template.update(sql,p.getName(),p.getName());
    }

    @Override
    public void update(Project p) {
        String sql="UPDATE t_user SET user_name = (?), credits = NULL, password = '123456', last_visits = NULL, last_ip = NULL WHERE user_id = (?)";
        template.update(sql,p.getName(),p.getId());
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void get(Long id) {

    }

    @Override
    public List<Project> list() {
        return null;
    }
}
