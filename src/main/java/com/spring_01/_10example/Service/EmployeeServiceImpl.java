package com.spring_01._10example.Service;

import com.spring_01._10example.Dao.IEmployeeDao;
import com.spring_01._10example.domain.Employee;

public class EmployeeServiceImpl implements IEmployeeService {
    private IEmployeeDao iEmployeeDao;
    @Override
    public void save(Employee employee) {
        System.out.println("做一些业务逻辑");
        iEmployeeDao.save(employee);
    }

//    public EmployeeServiceImpl(IEmployeeDao iEmployeeDao) {
//        this.iEmployeeDao = iEmployeeDao;
//    }

    public void setiEmployeeDao(IEmployeeDao iEmployeeDao) {
        this.iEmployeeDao = iEmployeeDao;
    }
}
