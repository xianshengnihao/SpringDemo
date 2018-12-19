package com.spring_02._04AOPbase._04CGlibProxy;

import org.springframework.stereotype.Component;

@Component
public class DataSource {

   public void getConnection(){
        System.out.println("得到连接。。。。。。。");
    }
    public void executeQuery(){
        System.out.println("执行查询sql。。。。。。。。。。");
    }
}
