package LeetCode.day13;


import javax.swing.tree.TreeNode;

public class low1 {
    public double[] convertTemperature(double celsius) {
        double[] num=new double[2];
        num[0]=celsius+273.15;
        num[1]=celsius*1.80 + 32.00;
        return num;
    }
    public int smallestEvenMultiple(int n) {
        if(n%2==0) return n;
        return 2*n;
    }
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

    public int xorOperation(int n, int start) {
        int[]  arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = start+i*2;
            sum=sum^arr[i];
        }
        return sum;
    }
    public String toLowerCase(String s) {

        return s;
    }

}
