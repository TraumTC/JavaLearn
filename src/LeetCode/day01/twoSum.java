package LeetCode.day01;

import java.util.Arrays;

public class twoSum {
    static void main(String[] args) {
        int [] nums={-18,12,3,0};
        int target=-6;
        int[] res= new int[2];
        res=twoSum(nums,target);
        System.out.println(Arrays.toString(res));
    }
    public static int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int[] res = new int[2];
        if (len < 2) {
            return res;
        }
        if (len == 2) {
            res[1] = 1;
            return res;
        }
        for (int i = 0; i < len; i++) {
            res[0] =i;
            int a = target - nums[i];
            for (int j = i + 1; j < len; j++) {
                if (a == nums[j]) {
                    res[1] = j;
                    return res;
                }
            }
        }
       return res;
    }
}
