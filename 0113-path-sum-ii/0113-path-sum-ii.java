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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) 
    {
        List<Integer> arr=new ArrayList<>();
        List<List<Integer>> arr1=new ArrayList<>();

        path(root,arr,arr1,0,targetSum);
        return arr1;

    }
    public void path(TreeNode root,List<Integer> arr, List<List<Integer>> arr1,int sum,int k)
    {
        if(root==null)
        {
            return;
        }
        arr.add(root.val);
        sum+=root.val;
        if(root.left==null&&root.right==null)
        {   if(sum==k){
            arr1.add(new ArrayList<>(arr));}
            arr.remove(arr.size()-1);
            sum-=root.val;
            return;
        }
        if(root.left!=null)
        {
            path(root.left,arr,arr1,sum,k);
        }
        if(root.right!=null)
        {
            path(root.right,arr,arr1,sum,k);
        }
        sum-=root.val;
        arr.remove(arr.size()-1);
    }
}