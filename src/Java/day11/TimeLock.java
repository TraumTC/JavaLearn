package Java.day11;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class TimeLock implements Runnable{
    private static ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        try {
            if(lock.tryLock(3, TimeUnit.SECONDS)){
                System.out.println(Thread.currentThread().getName() + "get lock" );
                Thread.sleep(2000);
//                lock.unlock();
            }else{
                System.out.println(Thread.currentThread().getName() + "get lock fail");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            if (lock.isHeldByCurrentThread()) {
                lock.unlock();
                System.out.println(Thread.currentThread().getName() + " release lock");
            }
        }
    }
}
