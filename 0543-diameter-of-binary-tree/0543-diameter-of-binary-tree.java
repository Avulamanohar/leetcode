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
    public int diameterOfBinaryTree(TreeNode root)
     {  
        int Max[]=new int[1];
        diameter(root,Max);
        return Max[0];
    }
    public int diameter(TreeNode root,int Max[])
    {
       if(root==null)
        {
            return 0;
        }
            int left=diameter(root.left,Max);
            int right=diameter(root.right,Max);
            Max[0]=Math.max(Max[0],left+right);
            return 1+Math.max(left,right);
            
            
        
    }
   
}