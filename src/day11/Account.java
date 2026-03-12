package day11;

import java.util.concurrent.locks.ReentrantLock;

public class Account implements Runnable{
    private static int id;
//    锁
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {

//        上锁
        lock.lock();
        id++;
        System.out.println(Thread.currentThread().getName() + "是第" + id + "位访客");
//        解锁
        lock.unlock();
    }
}
