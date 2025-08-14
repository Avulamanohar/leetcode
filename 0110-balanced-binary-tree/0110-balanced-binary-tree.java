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
    public boolean isBalanced(TreeNode root) 
    {
        int a=depth(root);
        if(a==-1)
         {
            return false;
         }
     return true;
    }
    public int depth(TreeNode root)
    {
       if(root==null)
       {
        return 0;
       }
      int a=depth(root.left);
      int b=depth(root.right);
      if(a==-1)
      {
        return -1;
      }
      if(b==-1)
      {
        return -1;
      }
      if(Math.abs(a-b)>1)
      {
        return -1;
      }
      
      return 1+Math.max(a,b);
    }
}