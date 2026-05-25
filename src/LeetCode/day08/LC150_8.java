package LeetCode.day08;

public class LC150_8 {
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int max = 0;
        for (int i = 0; i < n-1; i++) {
            if(prices[i]<prices[i+1]){
                max+=prices[i+1]-prices[i];
            }
        }
        return max;
    }

    static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
