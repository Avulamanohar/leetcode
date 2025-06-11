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
    public List<Integer> rightSideView(TreeNode root) 
    {
        List<Integer> arr1=new ArrayList<Integer>();
        int level=0;
        right(root,arr1,level);
        return arr1;
        
    }
    public void right(TreeNode root,List<Integer> arr,int level)
    {
             if(root==null)
             {
                return;
             }
             if(level==arr.size())
             {
                arr.add(root.val);
             }
             right(root.right,arr,level+1);
             right(root.left,arr,level+1);
    }
}