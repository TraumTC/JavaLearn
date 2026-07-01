package LeetCode.day23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class LC100_11 {
//    滑动窗口最大值
//    给你一个整数数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。
//    返回 滑动窗口中的最大值 。
     public static int[] maxSlidingWindow(int[] nums, int k) {
//         超时  暴力枚举
//         int len = nums.length;
//         int[] ans = new int[len - k + 1];
//         for (int i = 0; i < len-k+1; i++) {
//             int max = nums[i];
//             for (int j = 0; j < k; j++) {
//                 if (max < nums[j+i]) {
//                     max = nums[j+i];
//                 }
//             }
//             ans[i] = max;
//         }
//        return ans;

//         优先队列
         int len  = nums.length;
         PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> {
             if(a[0] != b[0]){
                 return b[0] - a[0];
             }else {
                 return b[1] - a[1];
             }
         });
//         第一个滑动窗口内数字入堆
//         数组存 数值 和 下标
         for (int i = 0; i < k; ++i) {
             pq.offer(new int[]{nums[i],i});
         }
         int[] ans = new int[len-k+1];
//         pq.peek() 只取堆顶元素
         ans[0] = pq.peek()[0];

         for (int i = k; i < len; ++i) {
             pq.offer(new int[]{nums[i],i});
//             判断此时堆顶元素是否在滑动窗口内
             while(pq.peek()[1] <= i-k){
                 pq.poll();
             }
             ans[i-k+1]=pq.peek()[0];
         }
         return ans;
    }

    static void main(String[] args) {
        int[] nums = new int[]{1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] ans = maxSlidingWindow(nums, k);
        System.out.println(Arrays.toString(ans));
    }
}
