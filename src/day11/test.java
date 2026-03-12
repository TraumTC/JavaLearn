package day11;

public class test {
    static void main(String[] args) {

        Account account = new Account();
        Thread t1 = new Thread(account,"张三");
        Thread t2 = new Thread(account,"李四");
        t1.start();
        t2.start();

        TimeLock lock = new TimeLock();
        new Thread(lock,"线程1").start();
        new Thread(lock,"线程2").start();

    }
}
