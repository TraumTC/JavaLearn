package LeetCode.day05;

import java.util.Arrays;

public class LC150_5 {
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        int n = nums[0];
        int index=1;
        int l = 0;
        int r = 1;
        while(r<nums.length){
            if(nums[r]==nums[l]){
                index++;
            }else{
                index=1;
            }
            if(index>max){
                max=index;
                n=nums[l];
            }
            l++;
            r++;
        }
        return n;
    }

    static void main(String[] args) {
        int[] nums = new int[]{3,2,3};
        System.out.println(majorityElement(nums));
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
