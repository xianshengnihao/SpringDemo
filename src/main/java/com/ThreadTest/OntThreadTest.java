package com.ThreadTest;

/**
 * 实现Runnable接口来实现多线程
 *  sleep()和wait的区别。wait()会释放锁，释放执行权。
 *  sleep()不会释放锁，释放执行权。知道时间结束之后加你个线程释放锁
 *  同一个对象的多个线程可以共享对象的资源，比如成员变量等
 */
public class OntThreadTest implements Runnable {
    int j= 0;
    @Override
    public  void run() {
            for (int i =0; i<20; i++) {
                    System.out.println(Thread.currentThread().getName() + "     " + i);
                System.out.println("j="+j++);
//                try {
//                    wait(1);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }

    }
    public static void main(String[] args)  {
        OntThreadTest ot =  new OntThreadTest();
//        for (int i =0;i<100;i++) {
////            System.out.println(Thread.currentThread().getName()+"++++"+i);
//            if (i==20) {
                new Thread(ot, "A线程").start();
                new Thread(ot, "B线程").start();
//            }
//        }
    }
}
