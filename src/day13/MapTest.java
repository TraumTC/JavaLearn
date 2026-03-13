package day13;

import java.util.HashMap;
import java.util.TreeMap;

public class MapTest {
    public static void main(String[] args) {
        HashMap map=new HashMap();
        map.put(map,map);
//        map.put("h","value2");
//        map.put("j","value1");
//        map.put("k","value1");
//        map.put("q","value1");
//        map.put("w","value1");
//        map.put("z","value1");
        System.out.println(map);
//        System.out.println(map.get("h"));


        TreeMap treeMap=new TreeMap();
        treeMap.put(new Date1(6),"和光同尘");
        treeMap.put(new Date1(7),"和光同尘");
        treeMap.put(new Date1(1),"和光同尘");
        treeMap.put(new Date1(2),"和光同尘");
        treeMap.put(new Date1(0),"和光同尘");
        treeMap.put(new Date1(9),"和光同尘");
        System.out.println(treeMap);
    }
}
