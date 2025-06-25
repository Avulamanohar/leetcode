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
 import java.util.*;
class Solution {
    public int sumNumbers(TreeNode root)
     {  
        ArrayList<Integer> arr=new ArrayList<Integer>();
        int k=0;
        sumN(root,arr,k);
        int n=arr.size();
        int i,j;
        int sum=0;
        for(i=0;i<n;i++)
        {
             sum+=arr.get(i);
        }
        return sum;
        
    }
    public  void sumN(TreeNode root,ArrayList<Integer> arr,int k)
    {      
           k=k*10+root.val;
           
           if(root.left==null && root.right==null)
           {
            arr.add(k);
           }
           if(root.left!=null)
           sumN(root.left,arr,k);

           if(root.right!=null)
           sumN(root.right,arr,k);
    }
}