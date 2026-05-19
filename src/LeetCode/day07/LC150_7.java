package LeetCode.day07;

public class LC150_7 {
    public static int maxProfit(int[] prices) {
//        暴力循环
//        int n = prices.length;
//        int max = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (prices[i] < prices[j]) {
//                    max = Math.max(max, prices[j] - prices[i]);
//                }
//            }
//        }
//        return max;

        int n = prices.length;
        int min = prices[0];
        int max = 0;
        for (int i = 1; i < n; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }else if (prices[i] - min > max) {
                max = prices[i] - min;
            }

        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {7,6,4,3,1};
        System.out.println(maxProfit(arr));
    }
}
