package LeetCode.day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC150_2 {
    public static int removeElement(int[] nums, int val) {
        int[] num = Arrays.stream(nums).filter(x -> x != val).toArray();
        for (int i = 0; i < num.length; i++) {
            nums[i] = num[i];
        }
        for (int i = num.length ;i<nums.length;i++) {
            nums[i] = 0;
        }
        return num.length;
    }

    static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        System.out.println(removeElement(nums,val));
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
