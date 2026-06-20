package LeetCode.day16;

public class low4 {
//    判断是否是丑数（质因数只有2、3、5）
    public boolean isUgly(int n) {
        if(n<=1) return false;
        while(n>1){
            if(n%2!=0){
                if(n%3!=0){
                    if(n%5!=0){
                        return false;
                    }else {
                        n=n/5;
                    }
                }else {
                    n=n/3;
                }
            }else {
                n=n/2;
            }
        }
        return true;
    }
//      重新排列数组
//      给你一个数组 nums ，数组中有 2n 个元素，按 [x1,x2,...,xn,y1,y2,...,yn] 的格式排列。
//      请你将数组按 [x1,y1,x2,y2,...,xn,yn] 格式重新排列，返回重排后的数组。
    public static int[] shuffle(int[] nums, int n) {
        if(n<=1) return nums;
        int[] nums1 = new int[2*n];
        for(int i=0,j=0; j<n; i=i+2,j++){
            nums1[i] = nums[j];
            nums1[i+1] = nums[n+j];
        }
        return  nums1;
    }
//    矩阵转置
    public int[][] transpose(int[][] matrix) {
        int[][] ans = new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                ans[j][i]=matrix[i][j];
            }
        }
        return ans;
    }
//    给你一个由若干 0 和 1 组成的字符串 s ，请你计算并返回将该字符串分割成两个 非空 子字符串（即 左 子字符串和 右 子字符串）所能获得的最大得分。
//   「分割字符串的得分」为 左 子字符串中 0 的数量加上 右 子字符串中 1 的数量。
    public static int maxScore(String s) {
        int max = 0;
        for (int i = 1; i < s.length(); i++) {
            int sum=0;
            int a = 0;
            for(char c : s.toCharArray()){
                if(a<i){
                    if(c=='0') sum+=1;
                }else  {
                    if(c=='1')sum+=1;
                }
                a++;
            }
            if(sum>max) max = sum;
        }
        return max;
    }
//      给你一个下标从 0 开始的字符串数组 words 和两个整数：left 和 right 。
//      如果字符串以元音字母开头并以元音字母结尾，那么该字符串就是一个 元音字符串 ，其中元音字母是 'a'、'e'、'i'、'o'、'u' 。
//      返回 words[i] 是元音字符串的数目，其中 i 在闭区间 [left, right] 内。
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for(int i=left; i<=right; i++){
            String str = words[i];
            char start = str.charAt(0);
            char end = str.charAt(str.length()-1);
            if((start == 'a'||start == 'e'||start == 'i'||start == 'o'||start == 'u')
                    &&
                    (end == 'a'||end == 'e'||end == 'i'||end == 'o'||end == 'u') )count++;

        }
        return count;
    }
//      给定一个长度为 n 的整数 山脉 数组 arr ，其中的值递增到一个 峰值元素 然后递减。
//      返回峰值元素的下标。
    public int peakIndexInMountainArray(int[] arr) {
        int n=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>arr[i+1]) {
                n = i;
                break;
            }
        }
        return n;
    }
    static void main(String[] args) {
//        int[] nums = {1,1,2,2};
//        int[] nums1 = shuffle(nums, nums.length/2);
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums1[i]);
//        }
        String a ="011101";
        System.out.println(maxScore(a));
    }
}
