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
    public TreeNode reverseOddLevels(TreeNode root) 
    {
        reverse(root.left,root.right,1);
        return root;
    }
    public void reverse(TreeNode l,TreeNode R,int t)
    {
        if(l==null||R==null)
        {
            return ;
        }
        if(t%2==1)
        {  
            int temp=l.val;
            l.val=R.val;
            R.val=temp;
        
        }
        reverse(l.left,R.right,t+1);
        reverse(l.right,R.left,t+1);


    }
}