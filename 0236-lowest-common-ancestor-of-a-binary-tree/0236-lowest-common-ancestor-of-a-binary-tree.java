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
      boolean a[]=new boolean[1];
      TreeNode k=root;
      TreeNode f=root;
      Low(k,arr,p,a);
       

      a[0]=false;
      Low(f,arr1,q,a);
      int i,j;
      int n=arr.size();
      int m=arr1.size();
      TreeNode l=null;
      for(i=0;i<n;i++)
      {
        for(j=0;j<m;j++)
        {
            if(arr.get(i)==arr1.get(j))
            {  
                l=arr.get(i);
                
            }
        }
      }

return l;
    }
    public void Low(TreeNode root,ArrayList<TreeNode> arr,TreeNode p,boolean b[])
    {
        if(root==null||b[0]==true)
        {
            return;
        }

        
          arr.add(root);
        if(p==root)
        {
            b[0]=true;
          return;  
        }
        else
        {
            
            if(root.left!=null)
            {
                Low(root.left,arr,p,b);
            }
            if(root.right!=null)
            {
                Low(root.right,arr,p,b);
            }
            if(!b[0])
            arr.remove(arr.size()-1);
        }
    }
}