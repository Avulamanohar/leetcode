/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxPathSum(TreeNode root)
     {
        
       int Max[]=new int[1];
       Max[0]=Integer.MIN_VALUE;
       maxSum(root,Max);
       return Max[0];

    }
    public int maxSum(TreeNode root,int M[])
    {
        if(root==null)
        {
            return 0;
        }
        int l=Math.max(0,maxSum(root.left,M));
        int r=Math.max(0,maxSum(root.right,M));
        M[0]=Math.max(M[0],root.val+l+r);
        return Math.max(l,r)+root.val;

    }
}