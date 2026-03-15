package Java.day19;

public class Test {
    static void main(String[] args) {
//        委托对象
        Apple apple = new Apple();
        Huawei huawei = new Huawei();
//        静态代理
        PhoneProxy phone = new PhoneProxy();
        System.out.println(phone.salePhone());

//        动态代理
//        中间类
        MyInvocationHandler handler = new MyInvocationHandler();
//        动态委托对象
        Phone phone1 = (Phone)handler.bind(huawei);
//        System.out.println(phone1);
        System.out.println(phone1.salePhone());

    }
}
