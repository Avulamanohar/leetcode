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
    public int goodNodes(TreeNode root) {
        
        int b[]=new int[1];
        hi(root,root.val,b);
        return b[0];
    }
    public void hi(TreeNode root,int a,int b[])
    {
        if(root==null)
        {
            return;
        }
        if(root.val>=a)
        {
        b[0]++;
        }
        hi(root.left,Math.max(root.val,a),b);
        hi(root.right,Math.max(root.val,a),b);


    }
}