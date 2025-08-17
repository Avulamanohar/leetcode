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
    public boolean isValidBST(TreeNode root)
     {
      
       long a=Integer.MIN_VALUE;
       long b=Integer.MAX_VALUE;
        return bast(root,a-1,b+1);
     }
     public boolean bast(TreeNode root,long min,long max)
     {
        if(root==null)
        {
            return true;
        }
        if(!(root.val<max&&root.val>min))
        {
            return false;
        }
        return bast(root.left,min,root.val)&&bast(root.right,root.val,max);
     }


}