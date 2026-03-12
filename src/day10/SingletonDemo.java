package day10;

public class SingletonDemo {
    private static SingletonDemo instance;
    static int id=1;

    private SingletonDemo() {
        System.out.println("创建了单例对象");
    }
    public static synchronized SingletonDemo getInstance() {
        if (instance == null) {
            instance = new SingletonDemo();
            id++;
        }
        return instance;
    }
    public static void getID(){
        System.out.println(id);
    }
}
