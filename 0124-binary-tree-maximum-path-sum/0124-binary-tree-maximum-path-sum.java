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
      int k= maxP(root,Max);
      return Max[0];
    }
    public int maxP(TreeNode root,int Max[])
    {
        
        if(root==null)
        {
            return 0;
        }
        int left=Math.max(0,maxP(root.left,Max));
        int right=Math.max(0,maxP(root.right,Max));
        Max[0]=Math.max(Max[0],root.val+left+right);
        return Math.max(left,right)+root.val;

    }
}