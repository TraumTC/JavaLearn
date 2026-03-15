package Java.day18;

import java.io.Serial;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {
    static void main(String[] args) {
        User user = new User();
        Class class1 = User.class;
        Class class3= Serial.class;
        try {
            Class class2=Class.forName("Java.day18.User");
            System.out.println(class1);
            System.out.println(class2);
            System.out.println(class3);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(class1.isInterface());
        System.out.println(class1.getName());
        System.out.println(class1.getSuperclass());
        System.out.println(class1.getSuperclass().getName());
        System.out.println(class1.getPackage());
        System.out.println(class1.getModifiers());
//      获取类的构造方法
        System.out.println("=====================分割线=======================");
        Constructor[] constructor = null;
        try {
            constructor =class1.getConstructors();
            for(Constructor c : constructor){
                System.out.println(c);
            }
            System.out.println(constructor);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("=====================分割线=======================");
//        获取类的public方法
//        包括父类的方法
        Method[] methods = class1.getMethods();
//        只获取自己的
        Method[] methods1 = class1.getDeclaredMethods();
        for(Method m : methods1){
            System.out.println(m);
        }
        System.out.println("=====================分割线=======================");
//        获取类的对象
//        只能获取public
        Field[] fields=class1.getFields();
//        获取全部的
        Field[] fields1 = class1.getDeclaredFields();
        for (Field f : fields1) {
            System.out.println(f);
        }
        System.out.println("=====================分割线=======================");
//        反射机制的应用
//        1、先获取类的构造方法
        try {
            Constructor c=class1.getConstructor(String.class,String.class,Integer.class);
//        2、使用constructor的newInstance方法使用构造方法，无参有参根据获取的种类
            Object o= c.newInstance("1","张三",18);
            System.out.println(o);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Cat cat=(Cat) getBean("Java.day18.Cat");
        System.out.println(cat);
//      反射的应用之 访问类的方法
        System.out.println("=====================分割线=======================");
        try {
            Constructor c= class1.getConstructor(null);
            User user1= (User) c.newInstance(null);
            System.out.println(user1);
            Method method=class1.getMethod("setName",String.class);
            method.invoke(user1,"李四");
            Method method1=class1.getMethod("setAge",Integer.class);
            method1.invoke(user1,18);
            Method method2=class1.getMethod("setId", String.class);
            method2.invoke(user1,"6");
            System.out.println(user1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

//        反射的应用之访问成员变量
        try {
            Constructor<User> c=class1.getConstructor();
            User u=c.newInstance(null);
            Field field=class1.getDeclaredField("name");
            field.setAccessible(true);//开启暴力反射
            field.set(u,"李四");

            System.out.println(field.get(u));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }





    public static  Object getBean(String name){
        try {
            Class class1 = Class.forName(name);
            Constructor c=class1.getConstructor(null);
            Object o=c.newInstance(null);
            return o;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
