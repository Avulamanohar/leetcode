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
    public int minDepth(TreeNode root) 
    {
       if(root==null)
       {
        return 0;
       }
       ArrayList<Integer> arr=new ArrayList<>() ;
      minD(1,root,arr);
      Collections.sort(arr);
      return arr.get(0);
        
    }
    public void minD(int ind,TreeNode root,ArrayList<Integer> arr)
    {
        if(root==null)
        {
            return;
        }


        if(root.left==null&&root.right==null)
        {
            arr.add(ind);
            return;
        }
        minD(ind+1,root.left,arr);
        minD(ind+1,root.right,arr);



    }
}