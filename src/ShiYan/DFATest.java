package ShiYan;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DFATest {
    private static final String S = "S", U = "U", V = "V", Q = "Q";

    private static final HashMap<String,String> f = new HashMap<>();

    private static final Set<String> endState = new HashSet<>();

    private static final char[] chars = {'a','b','c','d','e'};

    static {
        int size = chars.length;
        for (int i = 0; i < size; i++) {
            if(i%2==0){
                f.put(S+","+chars[i],U);
                f.put(V+","+chars[i],U);
                f.put(U+","+chars[i],Q);
            }else{
                f.put(S+","+chars[i],V);
                f.put(U+","+chars[i],V);
                f.put(V+","+chars[i],Q);
            }
            f.put(Q+","+chars[i],Q);
        }
         endState.add(Q);
    }

 public static boolean DFARun(String input) {
        String K = S;
        int index = 0;

        while (index < input.length()) {
            char c = input.charAt(index);
            String key = K + "," + c;

            if (!f.containsKey(key)) {
                return false;
            }
            K = f.get(key);
            index++;
        }
        return endState.contains(K);
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==== 通用DFA模拟程序====");

        while(true){
            System.out.print("\n请输入待测字符串(输入exit结束程序)：");
            String str = sc.nextLine();
            if(str.equals("exit")){
                System.out.println("程序结束");
                break;
            }
            boolean res = DFARun(str);
            if(res){
                System.out.println("运行结果：是 （该串合法）");
            }else{
                System.out.println("运行结果：否 （该串不合法）");
            }
        }
        sc.close();
    }
}
