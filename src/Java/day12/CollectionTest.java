package Java.day12;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
//
       List list =new ArrayList();
       list.add("Hello");
       list.add("Hello");
       list.add("world");
       list.add("JavaSE");
       list.add("JavaME");
       list.add("JavaEE");
        System.out.println(list.size());
        System.out.println(list.toString());
        List list2 =new ArrayList();
        list2.add(list2);
        System.out.println(list2);

        System.out.println("list是否包含JavaEE:" + list.contains("JavaEE"));
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("**************************");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.remove("Hello");
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        list.add(1,"Java");
        System.out.println(list);
        list.set(1,"C++");
        System.out.println(list);
        int i=list.indexOf("C++");
        System.out.println(i);
        List list3=list.subList(1,3);
        System.out.println(list3);

        System.out.println("=============HashSet================");

//  Set 可以存储一组无序且唯一的对象
        HashSet hashSet=new HashSet();
        hashSet.add("Hello");
        hashSet.add("World");
        hashSet.add("JavaEE");
        hashSet.add("Hello");
        System.out.println(hashSet.size());
        System.out.println(hashSet.toString());
        Iterator itr = hashSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        for(;;){
            if(!itr.hasNext()) break;
            System.out.println(itr.next());
        }

//  LinkedHashSet，可以存储一组有序且唯一的元素
//  有序：元素的存储顺序和遍历顺序是一致的
        System.out.println("=============LinkedHashSet================");
        LinkedHashSet set=new LinkedHashSet();
        set.add(new String("Hello"));
        set.add(new String("World"));
        set.add(new String("JavaEE"));
        set.add(new String("Hello"));
        System.out.println(set.size());
        System.out.println(set);
        Iterator itr1 = set.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }

    }
}
