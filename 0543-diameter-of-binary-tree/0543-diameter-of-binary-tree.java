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
    public int diameterOfBinaryTree(TreeNode root) {
        
        int a[]=new int[1];
         dia(root,a);
        return a[0];
    }
    public int dia(TreeNode root,int a[])
    {
        if(root==null)
        {
            return 0;

        }
        int l=dia(root.left,a);
        int r=dia(root.right,a);
        a[0]=Math.max(l+r,a[0]);
        return 1+Math.max(l,r);
    }
}