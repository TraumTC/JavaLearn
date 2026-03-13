package day13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet=new LinkedHashSet();
        Date d1=new Date(1);
        Date d2=new Date(1);
        System.out.println(d1.hashCode());
        System.out.println(d2.hashCode());
        linkedHashSet.add(d1);
        linkedHashSet.add(d2);
        Iterator iterator=linkedHashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        TreeSet treeSet=new TreeSet();
        treeSet.add(6);
        treeSet.add(5);
        treeSet.add(9);
        treeSet.add(10);
        treeSet.add(1);
        treeSet.add(11);
        treeSet.add(21);
        treeSet.add(19);
        System.out.println("size=" + treeSet.size());
        Iterator iterator1=treeSet.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        TreeSet treeSet1=new TreeSet();
        treeSet1.add(new Date1(6));
        treeSet1.add(new Date1(9));
        treeSet1.add(new Date1(7));
        treeSet1.add(new Date1(8));
        treeSet1.add(new Date1(1));
        treeSet1.add(new Date1(2));
        System.out.println("size=" + treeSet1.size());
        Iterator iterator2=treeSet1.iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }

    }
}
