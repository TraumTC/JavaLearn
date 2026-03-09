package day08;

public class runnable implements  Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("吃饭睡觉打豆豆" + i);
        }

    }
}
