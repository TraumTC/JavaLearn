package LeetCode.day06;

public class LC150_6 {
    public static void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int temp = nums[0];
            for (int i1 = 0; i1 < nums.length-1; i1++) {
                int temp1 = nums[i1+1];
                nums[i1+1] = temp;
                temp = temp1;
            }
            nums[0] = temp;
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        rotate(nums1, 1);
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }
    }
}
