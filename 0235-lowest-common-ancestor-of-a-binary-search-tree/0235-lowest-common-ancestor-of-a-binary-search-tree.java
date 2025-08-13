/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q)
    {
        ArrayList<TreeNode> arr=new ArrayList<>();
        ArrayList<TreeNode> arr1=new ArrayList<>();
        boolean b[]=new boolean[1];
        LCA(root,p,arr,b);
        b[0]=false;
        LCA(root,q,arr1,b);
       int i,j;
       TreeNode t=null;
       
       for(i=0;i<arr.size();i++)
       {
        for(j=0;j<arr1.size();j++)
        {
            if(arr.get(i)==arr1.get(j))
            {
             t=arr.get(i);
            }
           
        }
       }
        return t;
    
    }
    public void LCA(TreeNode root,TreeNode p,List<TreeNode> arr,boolean b[])
    {    if(b[0]==true)
    {
        return;
    }
    
        if(root==null)
        {
            return;
        }
        arr.add(root);
        if(root==p)
        {
            b[0]=true;
            return;
        }
        
            if(root.left!=null)
            {
                LCA(root.left,p,arr,b);
            }
            if(root.right!=null)
            {
                LCA(root.right,p,arr,b);
            }
            if(!b[0])
            arr.remove(arr.size()-1);
    
        
    }
}