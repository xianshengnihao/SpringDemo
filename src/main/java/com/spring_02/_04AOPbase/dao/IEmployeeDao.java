package com.spring_02._04AOPbase.dao;

import com.spring_02._04AOPbase.domain.Employee;

public interface IEmployeeDao {
    void save(Employee employee);
    void updata(Employee employee);
}
