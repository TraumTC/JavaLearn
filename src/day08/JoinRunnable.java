package day08;

public class JoinRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println( i + "=======================我是豆豆");
        }
    }
}
