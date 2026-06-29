package LeetCode.day22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LC100_09 {
    public static List<Integer> findAnagrams(String s, String p) {
        int plen = p.length();
        int slen = s.length();
        List<Integer> ans = new ArrayList<>();
        if (plen > slen) {
            return ans;
        }
//        char[] ss = s.toCharArray();
//        for (int i = 0; i <= slen-plen; i++) {
//            char[] sss = Arrays.copyOfRange(ss, i,plen+i);
//            String newp=p;
//            int index = 0;
//            for(char c:sss){
//                if(newp.indexOf(c)==-1){
//                    break;
//                }
//                newp = newp.replaceFirst((String.valueOf(c))," ");
//                index++;
//                if(index == plen){
//                    ans.add(i);
//                }
//            }
//        }
        int[] sCount = new int[26];
        int[] pCount = new int[26];
        for (int i = 0; i < plen; i++) {
            sCount[s.charAt(i) - 'a']++;
            pCount[p.charAt(i) - 'a']++;
        }
        if(Arrays.equals(sCount,pCount)){
            ans.add(0);
        }
        for (int i = 0; i < slen-plen; i++) {
            sCount[s.charAt(i)-'a']--;
            sCount[s.charAt(i+plen)-'a']++;
            if (Arrays.equals(sCount,pCount)) {
                ans.add(i+1);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> ans = findAnagrams(s, p);
        for (Integer i : ans) {
            System.out.println(i);
        }
    }
}
