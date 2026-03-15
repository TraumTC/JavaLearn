package Java.day05;

public class Test {
    static void main(String[] args) {
        User user = new User("1","tom","54188","niuma@sb.com","14588");
        System.out.println(user.toString());

        Cat cat=new Cat();
        System.out.println(user.equals(cat));
        String name1=new String("tom");
        String name2=new String("tom");
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
        System.out.println(name1.hashCode());
        System.out.println(name2.hashCode());

        int a=10;
        int b=10;
        System.out.println(a==b);
    }
}
