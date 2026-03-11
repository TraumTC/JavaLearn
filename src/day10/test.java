package day10;

public class test {
    static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            new Thread(()->{
                    SingletonDemo.getInstance();
            }).start();
        }
        SingletonDemo.getID();
    }
}
