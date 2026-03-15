package Java.day10;

public class DeadLockRunnable implements Runnable{
    private static Chopsticks chopsticks1 = new Chopsticks();
    private static Chopsticks chopsticks2  = new Chopsticks();
    public int num;
    @Override
    public void run() {
        if(num == 1){
            System.out.println(Thread.currentThread().getName() + "获取到筷子1，等待筷子2");
            synchronized (chopsticks1){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (chopsticks2){
                    System.out.println(Thread.currentThread().getName() + "用餐完毕");
                }
            }
        }
        if(num == 2){
            System.out.println(Thread.currentThread().getName() + "获取到筷子2，等待筷子1");
            synchronized (chopsticks2){
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                synchronized (chopsticks1){
                    System.out.println(Thread.currentThread().getName() + "用餐完毕");
                }
            }
        }

    }
}
