package LeetCode.day14;

public class low2 {
//      给你一个整数数组 nums 。
//      如果一组数字 (i,j) 满足 nums[i] == nums[j] 且 i < j ，就可以认为这是一组 好数对 。
//      返回好数对的数目。
    public static int numIdenticalPairs(int[] nums) {
//        int len = nums.length;
//        int num = 0;
//        for (int i = 0; i < len; i++) {
//            for (int j = i + 1; j < len; j++) {
//                if (nums[i] == nums[j]) {
//                    num++;
//                }
//            }
//        }
//        return num;
        int ans=0;
        int[] cnt=new int[101];
        for(int x:nums){
            ans+=cnt[x];
            cnt[x]++;
        }
        return ans;

    }
//      给你一个整数数组 arr ，以及 a、b 、c 三个整数。请你统计其中好三元组的数量。
//      如果三元组 (arr[i], arr[j], arr[k]) 满足下列全部条件，则认为它是一个 好三元组 。
//      0 <= i < j < k < arr.length
//      |arr[i] - arr[j]| <= a
//      |arr[j] - arr[k]| <= b
//      |arr[i] - arr[k]| <= c
//      其中 |x| 表示 x 的绝对值。
//      返回三元组数量
 public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int len = arr.length;
        int ans=0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if(Math.abs(arr[i]-arr[j])<=a){
                    for (int k = j + 1; k < len; k++) {
                    if(Math.abs(arr[i]-arr[k])<=c){
                        if(Math.abs(arr[j]-arr[k])<=b){
                            ans++;
                        }
                    }
                    }
                }
            }
        }
        return ans;
    }
    static void main(String[] args) {
        int[] nums=new int[]{1,1,1,1};
        int n=numIdenticalPairs(nums);
    }
}
