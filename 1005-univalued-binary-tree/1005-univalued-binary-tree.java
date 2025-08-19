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
    public boolean isUnivalTree(TreeNode root) 
    {
        return isUni(root,root.val);
        
    }
    public boolean isUni(TreeNode root,int a)
    {
        if(root==null)
        {return true;
        }
        if(root.val!=a)
        {
         return false;
        }
        return isUni(root.left,a)&&isUni(root.right,a);
    }
}