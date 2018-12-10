package com.spring._10example.Service;

import com.spring._10example.Dao.IEmployeeDao;
import com.spring._10example.domain.Employee;

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
