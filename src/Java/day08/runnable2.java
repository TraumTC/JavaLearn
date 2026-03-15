package Java.day08;

public class runnable2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("我是豆豆"+i);
        }
    }
}
