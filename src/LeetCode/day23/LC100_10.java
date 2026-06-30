package LeetCode.day23;

public class LC100_10 {
//    和为K的子数组
//    给你一个整数数组 nums 和一个整数 k ，请你统计并返回 该数组中和为 k 的子数组的个数 。
//    子数组是数组中元素的连续非空序列。
    public static int subarraySum(int[] nums, int k) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int index = 0;
        for (int i = 0; i < len; i++) {
            int sum = 0;
            for (int j = i; j < len; j++) {
                sum += nums[j];
                if (sum == k) {
                    index++;
                }
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        System.out.println(subarraySum(nums, 2));
    }
}
