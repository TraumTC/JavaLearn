package Java.day08;

public class MyThreadA extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if(i == 5){
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("+++++++++++++++++++++++++++++test" + i);

        }
    }
}
