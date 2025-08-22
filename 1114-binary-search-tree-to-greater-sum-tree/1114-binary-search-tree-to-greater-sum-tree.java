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
    public TreeNode bstToGst(TreeNode root) 
    {int a[]=new int[1];

        BST(root,a);
        return root;
    }
    public void BST(TreeNode root,int a[])
    {
        if(root==null)
        {
            return;
        }
        BST(root.right,a);
        a[0]+=root.val;
        root.val=a[0];
        BST(root.left,a);
    }
}