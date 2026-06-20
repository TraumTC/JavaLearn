package LeetCode.day13;


import javax.swing.tree.TreeNode;

public class low1 {
//    温度转换 摄氏度 转 华氏摄氏度  开尔文
    public double[] convertTemperature(double celsius) {
        double[] num=new double[2];
        num[0]=celsius+273.15;
        num[1]=celsius*1.80 + 32.00;
        return num;
    }
//      给你一个正整数 n ，返回 2 和 n 的最小公倍数（正整数）。
    public int smallestEvenMultiple(int n) {
        if(n%2==0) return n;
        return 2*n;
    }
//      给你一个 二叉树 的根结点 root，该二叉树由恰好 3 个结点组成：根结点、左子结点和右子结点。
//      如果根结点值等于两个子结点值之和，返回 true ，否则返回 false 。
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
                 this.val = val;
                 this.left = left;
                 this.right = right;
         }
    }
    public boolean checkTree(TreeNode root) {
        return root.val == (root.left.val + root.right.val);
    }
//      给你两个整数，n 和 start 。
//      数组 nums 定义为：nums[i] = start + 2*i（下标从 0 开始）且 n == nums.length 。
//      请返回 nums 中所有元素按位异或（XOR）后得到的结果。
    public int xorOperation(int n, int start) {
        int[]  arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = start+i*2;
            sum=sum^arr[i];
        }
        return sum;
    }
}
