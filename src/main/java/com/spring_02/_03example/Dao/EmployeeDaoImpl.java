package com.spring_02._03example.Dao;

import com.spring_02._03example.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements IEmployeeDao {
    @Autowired
    private DataSource dataSource;
    @Override
    public void save(Employee employee) {
        System.out.println("开启连接"+"   dataSource="+dataSource);
        System.out.println("执行sql");
        System.out.println("保存employee"+"   employee="+employee);
    }
}
