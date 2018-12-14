package com.spring_02._04AOPbase;

import org.springframework.stereotype.Component;

@Component
public class TransactionManager {
    public void begin(){
        System.out.println("开启事务");
    }
    public void commit(){
        System.out.println("提交事务");
    }
    public void rollback(){
        System.out.println("回滚事务");
    }
}
