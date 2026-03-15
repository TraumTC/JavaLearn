package Java.day11;

import java.util.concurrent.locks.ReentrantLock;

public class TicketRunnable implements Runnable {
//    剩余票
    private  int lastCount = 15;
//    卖出票
    private  int outCount = 0;
    private ReentrantLock lock = new ReentrantLock();

//    手动上锁解锁
//    执行卖票业务
    @Override
    public void run() {
        while(lastCount>0){
            lock.lock();
            if(lastCount>0){
                lastCount--;
                outCount++;
                System.out.println(Thread.currentThread().getName() + "卖出第" + outCount + "票，剩余"
                        + lastCount + "张票");
            }
                lock.unlock();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


//  使用  synchronized
//    @Override
//    public void run(){
//        while(lastCount > 0){
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            if(lastCount == 0){
//                break;
//            }
//            synchronized (TicketRunnable.class){
//                lastCount--;
//                outCount++;
//                System.out.println(Thread.currentThread().getName() + "卖出第" + outCount + "张票，剩余"
//                        + lastCount + "张票");
//            }
//        }
//    }
}
