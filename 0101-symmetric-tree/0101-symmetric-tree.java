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
    public boolean isSymmetric(TreeNode root)
     {
        if(root==null)
        {
            return true;
        }
        int i,j;
      ArrayList<Integer> arr1=new ArrayList<Integer>();
      ArrayList<Integer> arr2=new ArrayList<Integer>();
       Inorder1(root.left,arr1);
       Inorder2(root.right,arr2);
       boolean b=true; 
       int n=arr1.size();
       int m=arr2.size();
       if(m!=n)
       {
        return false;
       }
       for(i=0;i<n;i++)
       {
        if(arr1.get(i)!=arr2.get(i))
        {
              b=false;
              break;
        }
       }
       return b;
        
    }
    public void Inorder1(TreeNode root,ArrayList<Integer> arr)
    {
        if(root==null)
        {
              arr.add(-1);
            return;
        }
        arr.add(root.val);
        Inorder1(root.left,arr);
        Inorder1(root.right,arr);
    }
     public void Inorder2(TreeNode root,ArrayList<Integer> arr)
    {
        if(root==null)
        {
          arr.add(-1);
            return;
        }
        arr.add(root.val);
        Inorder2(root.right,arr);
        Inorder2(root.left,arr);

    }
}