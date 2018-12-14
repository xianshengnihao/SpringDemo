package com.spring_02._04AOPbase.dao;

import com.spring_02._04AOPbase.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements IEmployeeDao {
    @Autowired

    @Override
    public void save(Employee employee) {
        System.out.println("保存对象:"+employee);
    }

    @Override
    public void updata(Employee employee) {
        System.out.println("修改对象:"+employee);
    }
}
