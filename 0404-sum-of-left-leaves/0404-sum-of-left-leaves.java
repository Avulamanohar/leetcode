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
        sum(root,a,0,0);
        return a[0];
        
    }
    public void sum(TreeNode root,int a[],int ind,int p)
    {
        if(root==null)
        {
            return;
        }
        if(root.left==null&&root.right==null)
        {
            if(ind<p)
            {
                a[0]+=root.val;
            }
            return ;
        }
        sum(root.left,a,ind-1,ind);
        sum(root.right,a,ind+1,ind);
    }
}