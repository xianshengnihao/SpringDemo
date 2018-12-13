package com.spring_02._03example.acttion;

import com.spring_02._03example.Service.IEmployeeService;
import com.spring_02._03example.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("prototype")
public class EmployeeActtion {
    @Autowired
    private Employee employee;
    @Autowired
    private IEmployeeService iEmployeeService;
    public String execute(){
        System.out.println("接收参数");
        iEmployeeService.save(employee);
        return "success";
    }

}
