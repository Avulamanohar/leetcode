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
    public int pathSum(TreeNode root, int targetSum) {
        List<TreeNode> arr =new ArrayList<>();
        pre(root,arr);
        int count[]=new int[1];
        count[0]=0;
        long d[]=new long[1];
      
        int n=arr.size();
        for(int i=0;i<n;i++)
        {  d[0]=0;
            hi(arr.get(i),targetSum,count,d);
        }
        return count[0];

    }
    public void pre(TreeNode root,List<TreeNode> arr)
    {
        if(root==null)
        {
            return ;

        }
        arr.add(root);
        pre(root.left,arr);
        pre(root.right,arr);
    }
    public void hi(TreeNode root,int t,int c[],long b[])
    {
        if(root==null)
        {
            return;
        }
        b[0]+=(long)root.val;
        if(b[0]==(long)t)
        {
            c[0]++;
        }
       hi(root.left,t,c,b);
       hi(root.right,t,c,b);
       b[0]-=root.val;
    } 
}