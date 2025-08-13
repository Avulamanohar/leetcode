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
    public int findBottomLeftValue(TreeNode root)
    {
       ArrayList<Integer> arr=new ArrayList<>(); 
       Left(root,0,arr);
       int a=arr.get(arr.size()-1);
       return a;

    }
    public void Left(TreeNode root,int ind,ArrayList<Integer> arr)
    {
        if(root==null)
        {
            return;
        }
        if(ind==arr.size())
        {
            arr.add(root.val);
        }
        if(root.left!=null)
        {
            Left(root.left,ind+1,arr);
        }
        if(root.right!=null)
        {
            Left(root.right,ind+1,arr);
        }

    }
}