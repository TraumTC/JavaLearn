package LeetCode.day09;

public class LC150_10 {
    public static int jump(int[] nums) {
        int n = nums.length;
        int end = 0;
        int max = 0;
        int step = 0;
        for (int i = 0; i < n - 1; i++) {
            max = Math.max(max, i + nums[i]);
            if(i == end){
                end = max;
                step++;
            }
        }
        return step;
    }

    static void main(String[] args) {
        int[] nums1 = {2,3,1,1,4};
        System.out.println(jump(nums1));
    }
}
