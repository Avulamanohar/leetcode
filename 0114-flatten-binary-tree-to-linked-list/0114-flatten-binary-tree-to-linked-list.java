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
    public void flatten(TreeNode root) 
    {
      List<TreeNode> arr=new ArrayList<>();
      int i,j;
      TreeNode k=root;
       TreeNode b=root;
      flatten1(k,arr);
      int n=arr.size();
     
      for(i=1;i<n;i++)
      {
        TreeNode prev=arr.get(i-1);
        TreeNode curr=arr.get(i);

      prev.left=null;
      prev.right=curr;

      }  
     
        
    }
    public void flatten1(TreeNode root,List<TreeNode> arr)
    { if(root==null)
    {
        return;
    }

        arr.add(root);
        flatten1(root.left,arr);
        flatten1(root.right,arr);
    }
}