package LeetCode.day14;

public class low2 {
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
