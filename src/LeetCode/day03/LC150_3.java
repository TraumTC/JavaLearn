package LeetCode.day03;

import java.util.Arrays;

public class LC150_3 {
    public static int removeDuplicates(int[] nums) {
        int[] num= Arrays.stream(nums).distinct().toArray();
        int len = num.length;
         for (int i = 0; i < len; i++) {
            nums[i] = num[i];
        }
        for (int i = len ;i<nums.length;i++) {
            nums[i] = 0;
        }
        return len==0?0:len;
    }

    static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
