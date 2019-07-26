package com.ThreadTest;

/**
 * 继承Thread类实现多线程
 * 创建多个线程来调用的同时创建多个对象来调用，无法共享对象资源，所以一般采用实现Runnable接口的方式。
 * 缺点：无法使得俩个线程共享目标资源，因为启动俩个线程时候目标对象（ThreadTest）需要被初始化俩次
 */
public class ThreadTest extends Thread {
    String b;
    public ThreadTest(String b) {
        this.b = b;
    }

    int i ;
    public void run() {
        for (; i < 20; i++) {
            this.setName("线程"+b);
            System.out.println(Thread.currentThread().getName()+"        "+i);//返回当前正在执行的线程对象
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }


    public static void main(String[] args) throws InterruptedException {
        Runnable r = new Thread();
        new ThreadTest("B").start();
        Thread.currentThread().setName("Main");//给当前线程命名
        for (int i=0 ;i<20;i++){
            System.out.println(Thread.currentThread().getName()+"         "+i); //返回当前正在执行的线程对象（Main线程）
            /**
             * join()：该方法的作用是让执行该子线程的主线程（Main线程）进入阻塞状态，直到该子线程执行完毕，主线程（Main线程）进入就绪状态。
             */
            if(i==10){
                ThreadTest aa=  new ThreadTest("A");
                aa.start();
                aa.join();
                ThreadTest bb=  new ThreadTest("B");

            }
        }




    }
}
