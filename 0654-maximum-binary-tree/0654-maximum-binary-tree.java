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
    public TreeNode constructMaximumBinaryTree(int[] nums) 
    {
        List<Integer> arr=new ArrayList<>();
        for(int i:nums)
        {
            arr.add(i);
        }
        TreeNode t=consty(arr);
        return t;
    }
    public TreeNode consty(List<Integer> arr)
    {
        if(arr.size()==0)
        {
            return null;
        }
        if(arr.size()==1)
        {
            return new TreeNode(arr.get(0));
        }
        List<Integer> arr1=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();
        
        int i=maxi(arr);
        int a=arr.get(i);
        for(int j=0;j<i;j++)
        {
            arr1.add(arr.get(j));
        }
         for(int j=i+1;j<arr.size();j++)
        {
            arr2.add(arr.get(j));
        }
        TreeNode root=new TreeNode(a);
        root.left=consty(arr1);
        root.right=consty(arr2);
        return root;
        
    }
    public int maxi(List<Integer> arr)
    {   
        
        int i,j;
        int a=arr.get(0);
        int k=0;
        for(i=0;i<arr.size();i++)
        {
        if(a<arr.get(i))
        {
            k=i;
            a=arr.get(i);
        }
       
        } return k;
    }
}