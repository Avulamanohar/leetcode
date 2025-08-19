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
    public TreeNode convertBST(TreeNode root)
     {
        int b[]=new int[1];
        b[0]=0;
        conv(root,b);
        return root;
        
    }
    public void conv(TreeNode root,int b[])
    {
        if(root==null)
        {
            return;
        }
       
     conv(root.right,b);
      b[0]+=root.val;
        root.val=b[0];
     conv(root.left,b);
    }
}