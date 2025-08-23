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
    public int maxAncestorDiff(TreeNode root) 
    {List<Integer> arr=new ArrayList<>();
    
    int a[]=new int[1];
        maxi(root,arr,a);
        return a[0];
    }
    public void maxi(TreeNode root,List<Integer> arr,int a[] )
    {
        if(root==null)
        {
            return;
        }
        arr.add(root.val);
        if(root.left==null&&root.right==null)
        {
            int b=maxim(arr);
            a[0]=Math.max(a[0],b);
            arr.remove(arr.size()-1);
            return ;
        }
        maxi(root.left,arr,a);
        maxi(root.right,arr,a);
        arr.remove(arr.size()-1);
    }
    public int maxim(List<Integer> arr)
    {
        int a[]=new int[arr.size()];
        for(int i=0;i<arr.size();i++)
        {
            a[i]=arr.get(i);
        }
        Arrays.sort(a);
        return Math.abs(a[0]-a[arr.size()-1]);
    }
}