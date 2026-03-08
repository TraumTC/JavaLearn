package day02;

public class User {
    public static int num;
    static{
        num++;
        System.out.println("执行了一次静态代码块");

    }
}
