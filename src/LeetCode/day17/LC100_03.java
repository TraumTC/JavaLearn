package LeetCode.day17;

import java.util.Arrays;

public class LC100_03 {
//    最长连续序列
//    给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
    public static int longestConsecutive(int[] nums) {
        int max=0;
        int[] num= Arrays.stream(nums).distinct().toArray();
        Arrays.sort(num);
        int len=num.length;
        if(len<2) return len;
        int index=1;
        for (int i =1; i < len; i++) {
            if(num[i-1]==(num[i]-1)){
                index++;
            }else{
                index=1;
            }
            if(max<index){
                max=index;
            }
        }
        return max;
    }

    static void main() {
        int[] nums= {1,2,6,7,8};
        System.out.println(longestConsecutive(nums));
    }
}
