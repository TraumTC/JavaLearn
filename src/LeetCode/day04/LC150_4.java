package LeetCode.day04;

public class LC150_4 {
    public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        if(len==0||len==1){
            return len;
        }
//        int l=len-1;
//        int r = len-2;
//        int flag=0;
//        int num = 0;
//        while (r>=0){
//            if(nums[r]!=nums[l]){
//                flag=0;
//            }
//            if(nums[r]==nums[l]){
//                if(flag==1){
//                    nums[l+1]=nums[len-1-num];
//                    nums[len-1-num]=0;
//                    num++;
//                }
//                flag=1;
//            }
//            l--;
//            r--;
//        }
//        return len-num;
        int i=0;
        for(int n : nums){
            if(i<2 || n!=nums[i-2]){
                nums[i++]=n;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,2,2,2,3,6,6,7,7};
        System.out.println(removeDuplicates(nums));
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
