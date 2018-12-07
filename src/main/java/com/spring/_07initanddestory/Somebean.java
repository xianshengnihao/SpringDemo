package com.spring._07initanddestory;

public class Somebean {
    public  void init(){
        System.out.println("做一些初始化操作的方法，必须调用这个方法bean才能用");
    }
    public void sayhi(){
        System.out.println("helloSpring");
    }

    public void destory(){
        System.out.println("在系统关闭的时候调用这个方法释放一些资源");
    }
}
