package LeetCode.day15;

public class low3 {
//    给你一个字符串 s ，将该字符串中的大写字母转换成相同的小写字母，返回新的字符串。
    public static String toLowerCase(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] = (char) (arr[i] + 32);
            }
        }
//        return s.toLowerCase();
        return new String(arr);
    }
//    给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。返回这个结果。
    public int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        int a = 0;
        while (num > 0) {
            a += num % 10;
            num /= 10;
        }
        return addDigits(a);
    }
//    给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
    public int subtractProductAndSum(int n) {
        int a=1;
        int b=0;
        while (n>0){
            a*=n%10;
            b+=n%10;
            n/=10;
        }
        return a-b;
    }
//      给你一个整数 n，请你判断该整数是否是 2 的幂次方。如果是，返回 true ；否则，返回 false 。
//      如果存在一个整数 x 使得 n == 2x ，则认为 n 是 2 的幂次方。
    public static boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        double a =(double)n;
        while (a>1){
            if(0<(a/2.0)&& (a/2.0)<1) return false;
            a/=2.0;
        }
        return true;
    }

    static void main() {
        System.out.println(isPowerOfTwo(1));
    }
}
