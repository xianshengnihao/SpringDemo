package com.spring_02._04SrpingAop.dao;

import com.spring_02._04AOPbase.domain.Employee;

public class Employeehaha implements IEmployeeDao {
    @Override
    public void save(Employee employee) {
        System.out.println("保存对象:" + employee);
    }

    @Override
    public void updata(Employee employee) {
        System.out.println("修改对象:" + employee);
    }

    @Override
    public Employee get() {
        System.out.println("执行查询sql");
        return new Employee();
    }
}
