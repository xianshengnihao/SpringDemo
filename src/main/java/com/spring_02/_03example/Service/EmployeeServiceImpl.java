package com.spring_02._03example.Service;

import com.spring_02._03example.Dao.IEmployeeDao;
import com.spring_02._03example.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    private IEmployeeDao iEmployeeDao;
    @Override
    public void save(Employee employee) {
        System.out.println("做一些业务逻辑");
        iEmployeeDao.save(employee);
    }
}
