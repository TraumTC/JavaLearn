package LeetCode.day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC100_06 {
//      给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，
//      同时还满足 nums[i] + nums[j] + nums[k] == 0 。请你返回所有和为 0 且不重复的三元组。
//      注意：答案中不可以包含重复的三元组。
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int len = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int third = len - 1;
            int x = -nums[i];
            for (int j = i + 1; j < len; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                while(j<third && nums[j] + nums[third] > x){
                    third--;
                }
                if(j==third){
                    break;
                }
                if(nums[j] + nums[third] == x){
                    list.add(Arrays.asList(nums[i],nums[j],nums[third]));
                }
            }
        }

        return  list;
    }
}
