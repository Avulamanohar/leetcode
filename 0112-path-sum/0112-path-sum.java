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
    public boolean hasPathSum(TreeNode root, int targetSum) 
    {
    boolean b[]=new boolean[1];
    int a[]=new int[1];
    a[0]=0;
    hasPath(root,a,targetSum,b);
    return b[0];
        

    }
    public void  hasPath(TreeNode root,int sum[],int t,boolean b[])
    {
        if(root==null)
        {
            return;
        }
        sum[0]+=root.val;
        if(root.left==null&&root.right==null)
        {
         if(sum[0]==t)
         {
            b[0]=true;
         }
         sum[0]-=root.val;
         return;
        }
        if(root.left!=null)
        {
            hasPath(root.left,sum,t,b);
            
        }
        if(root.right!=null)
        {
            hasPath(root.right,sum,t,b);
        }
        sum[0]-=root.val;

        
    }


}