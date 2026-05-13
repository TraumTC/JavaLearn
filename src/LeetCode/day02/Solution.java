package LeetCode.day02;

import java.util.Arrays;

public class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        if(m == 0){
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
        }
        else if(n == 0){}
        else
        {
            for(int i = 0; i < n; i++){
                nums1[m+i] = nums2[i];
            }
            for(int i = 0; i <m+n-1; i++){
                for(int j = i+1; j <m+n; j++){
                    if(nums1[j] < nums1[i]){
                        int  t = nums1[i];
                        nums1[i] = nums1[j];
                        nums1[j] = t;
                    }
                }
            }
        }
    }

    static void main(String[] args) {
        int[] nums1 = {1,2,3,4,0,0,0,0};
        int[] nums2 = {5,6,7,8};
        merge(nums1,4,nums2,4);
        System.out.println(Arrays.toString(nums1));
    }
}
