package com.spring_02._04AOPbase._04CGlibProxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.stereotype.Component;
import java.lang.reflect.Method;

/**
 * 使用cglib动态代理继承InvocationHandler接口是
 * org.springframework.cglib.proxy.InvocationHandler下的
 * 对于要被动态代理的类如果没有实现任何接口，就不能使用JDK代理，只能使用继承的方式来完成
 * spring默认使用cglib动态代理
 */
@Component
public class LogInvocationHandler implements InvocationHandler {
    @Autowired
    private DataSource dataSource;
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("日志记录开始");
        Object ret = method.invoke(dataSource, args);
        return ret;
    }
}
