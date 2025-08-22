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
    public TreeNode addOneRow(TreeNode root, int val, int depth) 
    { TreeNode t=null;
        if(depth==1)
    {
      t =new TreeNode(val);
        t.left=root;
         return t;
        
    }
    DFS(root,depth-1,val);
    return root;
       
    }
    public void DFS(TreeNode root,int depth,int val)
    {    if(root==null)
    {
        return;
    }
        if(depth==1&&root!=null)
        {   TreeNode val1=new TreeNode(val);
          TreeNode val2=new TreeNode(val);
            TreeNode temp=root.left;
            TreeNode temp2=root.right;
            root.left=val1;
            root.right=val2;
            val1.left=temp;
            val2.right=temp2;
            return;
        }
       DFS(root.left,depth-1,val);
 DFS(root.right,depth-1,val);
    }

}