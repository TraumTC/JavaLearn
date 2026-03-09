package day08;

public class ThreadTest {
//    多线程
//    线程是用来执行任务的
    static void main(String[] args) {
//        new Thread(()->{
//            for (int i = 0; i < 100; i++) {
//                System.out.println("++++++++54188");
//            }
//        }).start();
//        new Thread(()->{
//            for (int i = 0; i < 100; i++) {
//                System.out.println("++++++++ABCD14588");
//            }
//        }).start();


//        MyThreadA myThreadA=new MyThreadA();
//        MyThreadB myThreadB=new MyThreadB();
//        myThreadA.start();
//        myThreadB.start();

        runnable runnable = new runnable();
        runnable2 runnable2 = new runnable2();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
    }



}
