package com.spring_02._04AOPbase._01decorator;

import com.spring_02._04AOPbase.TransactionManager;
import com.spring_02._04AOPbase.dao.IEmployeeDao;
import com.spring_02._04AOPbase.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 装饰模式
 * 静态代理
 */
@Component
public class EmployeeDaoWrapper implements IEmployeeDao {
    @Autowired
    private TransactionManager transactionManager;
    @Autowired
    @Qualifier("employeeDaoImpl")
    private IEmployeeDao iEmployeeDao;

    /**
     * 静态代理时该将该bean的创建放在了EmployeeDaoWrapper中，其他类无法使用因为用注解形式创建的bean，要体现该静态代理
     * 需要用xml方式来体现，顾只能在此new EmployeeDaoImpl来体现，且需要EmployeeDaoImpl不被扫描到。
     * IEmployeeDao iEmployeeDao = new EmployeeDaoImpl();
     */
//  IEmployeeDao iEmployeeDao = new EmployeeDaoImpl();
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

    @Override
    public Employee get() {
        return null;
    }
}
