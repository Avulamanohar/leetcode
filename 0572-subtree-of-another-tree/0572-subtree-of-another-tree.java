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
    public boolean isSubtree(TreeNode root, TreeNode subRoot)
    { 
        ArrayList<TreeNode> arr=new ArrayList<>();
        
        boolean b[]=new boolean[1];
        int i,j;
       
       
        hi(root,subRoot,arr);
         int n=arr.size();
         
        
        for(i=0;i<n;i++)
        {
             b[0]=true;
        TreeNode k=arr.get(i);
        Sub(k,subRoot,b); 
        if(b[0])
       {
       return true;
       }
        }
       
       return false;
    }
    public void hi(TreeNode root,TreeNode sub,ArrayList<TreeNode> arr)
    
    {

        
        if(root==null)
        {
            return;
        }
        if(root.val==sub.val)
        {
            arr.add(root);
        }
        hi(root.left,sub,arr);
        hi(root.right,sub,arr);
    }
    public void Sub(TreeNode Node,TreeNode sub,boolean b[])
    {if(Node==null&&sub==null)
    {
        return;
    }
        if(Node==null||sub==null)
        {   b[0]=false;
            return;
        }
        if(Node.val!=sub.val)
        {
            b[0]=false;
            return;
        }
      Sub(Node.left,sub.left,b);
      Sub(Node.right,sub.right,b);
    }
}