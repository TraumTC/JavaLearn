package JavaWeb.day03;

import java.util.Scanner;

public class test {
    static void main(String[] args) {
//        这一步只创建对象
        Scanner sc = new Scanner(System.in);
        System.out.print("小唐说：");
//        调用方法，才会等待输入数据。
        String name = sc.nextLine();
        System.out.println(name);
    }
}
