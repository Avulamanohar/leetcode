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
    public TreeNode sortedArrayToBST(int[] nums) 
    {   List<Integer> arr=new ArrayList<>();
       for(int i:nums)
       {
arr.add(i);
       }
       return BST(arr);
    }
    public TreeNode BST(List<Integer> arr)
    {
        if(arr.size()==0)
        {
            return null;
        }
        int i,j;
        int n=arr.size();
        TreeNode root=new TreeNode(arr.get(n/2));
        List<Integer> arr1=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();
        for(i=0;i<n/2;i++)
        {
            arr1.add(arr.get(i));
        }
        for(i=n/2+1;i<n;i++)
        {
            arr2.add(arr.get(i));
        }
        root.left=BST(arr1);
        root.right=BST(arr2);

        return root;

    }
}