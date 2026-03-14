package day14;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsTest {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add("Hello");
        a.add("World");
        System.out.println("添加元素之前的集合:" + a);
        a.add("hahahaha");
        Collections.addAll(a,"你好","世界");
        System.out.println("添加元素之后的集合:" + a);
        Collections.reverse(a);
        System.out.println("反转后的集合：" + a);
        Collections.swap(a,0,1);
        System.out.println("交换后0 1位置的集合" + a);
        Collections.sort(a);
        System.out.println("排序后的集合：" + a);


        CollectionTest(1,2,3);
        CollectionTest(1,2,3,5,6);
        CollectionTest(1,2,3,5,6,7);
    }

    public static void CollectionTest(int... num){
        System.out.println(num);
        System.out.println(num.length);

    }
}
