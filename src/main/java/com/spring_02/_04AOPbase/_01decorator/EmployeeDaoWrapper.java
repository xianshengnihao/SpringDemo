package com.spring_02._04AOPbase._01decorator;

import com.spring_02._04AOPbase.TransactionManager;
import com.spring_02._04AOPbase.dao.IEmployeeDao;
import com.spring_02._04AOPbase.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDaoWrapper implements IEmployeeDao {
    @Autowired
    private TransactionManager transactionManager;
    @Autowired
    @Qualifier("employeeDaoImpl")
    private IEmployeeDao iEmployeeDao;
    @Override
    public void save(Employee employee) {
        try {
            transactionManager.begin();
            iEmployeeDao.save(employee);
            transactionManager.commit();
        }catch (Exception ex){
            transactionManager.rollback();
        }finally {
            System.out.println("关闭资源");
        }
    }

    @Override
    public void updata(Employee employee) {
        try {
            transactionManager.begin();
            iEmployeeDao.updata(employee);
            transactionManager.commit();
        }catch (Exception ex){
            transactionManager.rollback();
        }finally {
            System.out.println("关闭资源");
        }
    }
}
