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
    public int sumOfLeftLeaves(TreeNode root)
    {
        if(root.left==null&&root.right==null)
        {
            return 0;
        }
        int a[]=new int[1];
        a[0]=0;
        boolean b=false;
      
        return   sum(root,b);
        
    }
    public int  sum(TreeNode root,boolean b)
    {
        if(root==null)
        {
            return 0;
        }
        if(root.left==null&&root.right==null)
        {
              if(b)
              {
                return root.val;
              }
              return 0;
        }
        return sum(root.left,true)+sum(root.right,false);
        
    }
}