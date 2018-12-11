package com.spring_01._10example.Dao;

import com.spring_01._10example.domain.Employee;

public class EmployeeDaoImpl implements IEmployeeDao {
    private DataSource dataSource;
    @Override
    public void save(Employee employee) {
        System.out.println("开启连接"+dataSource);
        System.out.println("执行sql");
        System.out.println("保存employee"+employee);
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
