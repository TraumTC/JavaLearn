package LeetCode.day08;

public class LC150_9 {
    public static boolean canJump(int[] nums) {
//        int n = nums.length;
//        if (n < 2) {
//            return true;
//        }
//        for (int i = 0; i < n;i++) {
//             if(nums[i]==0){
//                return false;
//            }
//            boolean flag = true;
//            int j =0;
//            j=i + nums[i];
//            while(flag){
//                if(j>=n-1){
//                    return true;
//                }
//                if(nums[j]==0){
//                    flag = false;
//                }
//                j=nums[j]+j;
//            }
//        }
//        return false;
        int n = nums.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if(i<=max){
                max = Math.max(max,i+nums[i]);
                if(max>=n-1){
                    return true;
                }
            }
        }
        return false;
    }
    static void main(String[] args) {
        int[] nums={2,3,1,1,4};
        int[] nums1={3,2,1,0,4};
        System.out.println(canJump(nums1));
    }
}
