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
    public TreeNode increasingBST(TreeNode root) 
    {
       List<TreeNode> arr=new ArrayList<>(); 
       increasing(root,arr);
       int n=arr.size();
       for(int i=1;i<n;i++)
       {
        TreeNode prev=arr.get(i-1);
        TreeNode curr=arr.get(i);
        prev.left=null;
        prev.right=curr;
       }
       arr.get(n-1).left=null;
       arr.get(n-1).right=null;
       return arr.get(0);
    }
    public void increasing(TreeNode root,List<TreeNode> arr)
    {
        if(root==null)
        {
            return;
        }
        increasing(root.left,arr);
        arr.add(root);
        increasing(root.right,arr);
    }

}