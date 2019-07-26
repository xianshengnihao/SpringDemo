package com.spring_02._06AnnAop.ProxyBean;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AdiceBean {
//    @Pointcut("execution(* com.spring_02._06AnnAop.dao.ITarget.*(..))")
    @Pointcut("execution(* com.spring_02._06AnnAop.dao.ITarget.somethin(..))")
    public void pc(){}

    @Before("pc()")
    public void before(){
        System.out.println("开启事务");
    }
    @AfterReturning("pc()")
    public void afterReturning(){
        System.out.println("提交事务");
    }
    @After("pc()")
    public void after(){
        System.out.println("关闭资源");
    }
    @AfterThrowing("pc()")
    public void afterThrowing(){
        System.out.println("回滚事务");
    }
}
