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
    public boolean isSymmetric(TreeNode root)
     {
        TreeNode left=root.left;
        TreeNode right=root.left;
        if(root==null)
        {
            return true;
        }
        return b(root.left,root.right);
        
    }
    public boolean b(TreeNode a,TreeNode b)
    {
        if(a==null&&b==null)
        {
            return true;
        }
        if(a==null || b==null || a.val!=b.val)
        {
            return false;
        }
        return b(a.left,b.right)&&b(a.right,b.left);
    }
}
