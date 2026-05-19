package LeetCode.day06;

public class LC150_6 {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[(i + k) % n] = nums[i];
        }
        System.arraycopy(num, 0, nums, 0, n);
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        rotate(nums1, 1);
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }
    }
}
