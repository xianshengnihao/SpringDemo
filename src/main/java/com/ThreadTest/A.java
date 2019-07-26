package com.ThreadTest;

import java.util.ArrayList;
import java.util.List;

public class A implements Runnable {
    Integer i =0;
    public static void b(){

    }
    public void getI(){
        i++;
        System.out.println(i);
    }
    @Override
    public void run() {

            System.out.println(Thread.currentThread().getName()+"   "+i++);
    }


    public static void main(String[] args) {
        A a = new A();
        for (int i = 0; i < 10; i++) {
            new Thread(a,"线程A").start();
            new Thread(a,"线程B").start();
            new Thread(a,"线程C").start();

            System.out.println("============"+i);

        }
        List lis = new ArrayList();
        StringBuffer str = new StringBuffer("22");      //线程安全，适用于多线程场景，但是效率低
        StringBuilder str2 = new StringBuilder("33");   //线程不安全，适用于单线程场景，效率很高


    }
}
