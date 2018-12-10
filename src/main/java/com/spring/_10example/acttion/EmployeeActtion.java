package com.spring._10example.acttion;

import com.spring._10example.Service.IEmployeeService;
import com.spring._10example.domain.Employee;

public class EmployeeActtion {
    private IEmployeeService iEmployeeService;
    public String execute(){
        System.out.println("接收参数");
        iEmployeeService.save(new Employee());
        return "success";
    }

    public void setiEmployeeService(IEmployeeService iEmployeeService) {
        this.iEmployeeService = iEmployeeService;
    }
}
