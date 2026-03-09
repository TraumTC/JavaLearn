package day08;

public class MyThreadA extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("+++++++++++++++++++++++++++++test");
        }
    }
}
