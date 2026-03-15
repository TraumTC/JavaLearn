package Java.day09;

public class Account implements Runnable{
    private static int id;

    @Override
//    synchronized 关键字加锁 防止多个线程运行时，
//    只有一个线程可以进入。

    public synchronized void run() {
        id++;
        System.out.println(Thread.currentThread().getName() + "是当前的第" + id +"位访客");

    }
}
