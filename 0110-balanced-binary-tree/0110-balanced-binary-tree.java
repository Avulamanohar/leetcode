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
        boolean a[]=new boolean[1];
        a[0]=true;
        is(root,a);
        return a[0];
    }
    public int is(TreeNode root,boolean ar[])
    {
        if(root==null)
        {
            return 0;
        }
        int a=1+is(root.left,ar);
        int b=1+is(root.right,ar);
        if(Math.abs(a-b)>1)
        {
            ar[0]=false;
        }
        return Math.max(a,b);
    }
    }