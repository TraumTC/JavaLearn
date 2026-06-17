package LeetCode.day15;

public class low3 {
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
