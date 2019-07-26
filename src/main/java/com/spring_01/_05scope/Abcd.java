package com.spring_01._05scope;

/**
 * 多线程 继承Thread类
 */
public class Abcd extends Thread{
    private String name;
    public Abcd(String name){
        this.name=name;
    }

    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(name+"    :   "+i);
//            try {
//                sleep(1000);   //.sleep()方法调用目的是不让当前线程独自霸占该进程所获取的CPU资源，以留出一定时间给其他线程执行的机会。
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
