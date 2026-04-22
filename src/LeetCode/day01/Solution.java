package LeetCode.day01;

import java.util.*;

public class Solution {
    static void main(String[] args) {

    }

    public static List<List<String>> groupAnagrams(String[] str) {
        Map<String,List<String>> map=new HashMap<>();

        for(String s:str){
//            将字符串拆解为 单个字符
            char[] arr=s.toCharArray();
//            将单个字符排序
            Arrays.sort(arr);
//            重组为字符串
            String key=new String(arr);
//            map里面不存在这个Key,就创建一个新的列表。
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
