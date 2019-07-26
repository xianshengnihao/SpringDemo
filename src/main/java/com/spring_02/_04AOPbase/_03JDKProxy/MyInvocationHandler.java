package com.spring_02._04AOPbase._03JDKProxy;

import com.spring_02._04SrpingAop.TransactionManager;
import com.spring_02._04AOPbase.dao.EmployeeDaoImpl;
import com.spring_02._04AOPbase.dao.IEmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 继承InvocationHandler接口实现动态代理
 * 在代理类上调用接口的任何一个方法，这个方法的调用都会被InvocationHandler
 * 所拦截，其中的method就是这次调用的方法，其中arg就是这次调用方法传入的参数
 * 对于要被动态代理的类如果没有实现任何接口，就不能使用JDK代理，只能使用继承的方式来完成
 *  * spring默认使用cglib动态代理
 */
@Component
public class MyInvocationHandler implements InvocationHandler {
    @Autowired
    private TransactionManager transactionManager;
    IEmployeeDao iEmployeeDao = new EmployeeDaoImpl();

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object ret = null;
        try {
            transactionManager.begin();
            ret = method.invoke(iEmployeeDao, args);
            transactionManager.commit();
        } catch (Throwable e) {
            transactionManager.rollback();
        } finally {
            System.out.println("关闭资源");
        }

        return null;
    }
}
