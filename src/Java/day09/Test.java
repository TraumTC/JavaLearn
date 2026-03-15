package Java.day09;

public class Test {
    static void main(String[] args) {
        Account account = new Account();
        Thread r1 = new Thread(account,"张三");
        Thread r2 = new Thread(account,"李四");
        Thread r3 = new Thread(account,"王五");
        Thread r4 = new Thread(account,"老六");

        r1.start();
        r2.start();
        r3.start();
        r4.start();
    }
}
