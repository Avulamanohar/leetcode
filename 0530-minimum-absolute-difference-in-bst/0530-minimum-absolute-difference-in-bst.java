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
    public int getMinimumDifference(TreeNode root) 
    {
        Set<Integer> hs=new TreeSet<>();
        getMin(root,hs);
        List<Integer> arr=new ArrayList<>(hs);
        int n=arr.size();
        int a=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++)
        {
           a=Math.min(arr.get(i+1)-arr.get(i),a);
        }
        
        return a;
    }
    public void getMin(TreeNode root,Set<Integer> hs)
    {
        if(root==null)
        {
            return;
        }
        hs.add(root.val);
        getMin(root.left,hs);
        getMin(root.right,hs);
    }
    
}