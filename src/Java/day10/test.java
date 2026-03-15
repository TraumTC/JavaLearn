package Java.day10;

public class test {
    static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(()->{
                    SingletonDemo.getInstance();
            }).start();
        }
        SingletonDemo.getID();


//  模拟死锁情况
        DeadLockRunnable dr1 = new DeadLockRunnable();
        DeadLockRunnable dr2 = new DeadLockRunnable();
        dr1.num=1;
        dr2.num=2;
        Thread t1 = new Thread(dr1,"线程1");
        Thread t2 = new Thread(dr2,"线程2");
        t1.start();
//        主线程休眠时间 大于子线程休眠时间
        try {
            t1.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();

    }
}
