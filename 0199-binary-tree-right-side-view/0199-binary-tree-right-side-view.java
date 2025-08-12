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

        List<Integer> arr=new ArrayList<>();
        R(0,root,arr);
        return arr;
    }
    public void R(int ind,TreeNode root,List<Integer> arr)
    {
           if(root==null)
           {
            return;
           }
           if(arr.size()==ind)
           {
           arr.add(root.val);
           }
           if(root.right!=null)
           {
                R(ind+1,root.right,arr);
           }
           if(root.left!=null)
           {
            R(ind+1,root.left,arr);
           }

    }
}