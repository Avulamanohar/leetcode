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
    public boolean isCousins(TreeNode root, int x, int y)
    {
      int a[]=new int[4];
        a[0]=-1;
        a[1]=-1; 
        a[2]=-1;
        a[3]=-1;
     
        isCousin(1,null,root,a,x,y);
        if(a[0]!=-1&&a[1]!=-1)
        {
             if(a[0]==a[1])
             {
                if(a[2]!=a[3])
                return true;
             }
        }  
        return false;
    }
    public void isCousin(int ind,TreeNode p,TreeNode root,int a[],int x,int y)
    {
if(root==null)
{
    return;
}

if(root.val==x)
{
    a[0]=ind;
    if(p!=null)
    a[2]=p.val;
}
if(root.val==y)
{
    a[1]=ind;
    if(p!=null)
    a[3]=p.val;
}

if(root.left!=null)
{p=root;
    isCousin(ind+1,p,root.left,a,x,y);
}

if(root.right!=null)
{  p=root;
    isCousin(ind+1,p,root.right,a,x,y);
}
    }
}