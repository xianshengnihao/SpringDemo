package com.spring_03.spring_jdbc.Dao;

import com.spring_03.spring_jdbc.Project;

import java.util.List;

/**
 * @Author: hwg
 * @Date: Create in 2019/7/2
 */
public interface IprojectDao {

    void save(Project p);
    void update(Project p);
    void delete(Long id);
    void get(Long id);
    List<Project> list();
}
