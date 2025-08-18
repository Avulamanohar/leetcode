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
    public int sumRootToLeaf(TreeNode root) 
    {
        List<Integer> arr=new ArrayList<>();
        List<List<Integer>> arr1=new ArrayList<>();
        int sum=0;
        Sum(root,arr,arr1);
        for(List<Integer> ab:arr1)
        {
           sum+=St(ab);
        }
return sum;

        
    }
    public void Sum(TreeNode root,List<Integer> arr,List<List<Integer>> arr1)
    {
        if(root==null)
        {
            return;
        }
         arr.add(root.val);
        if(root.left==null&&root.right==null)
        {
           
            arr1.add(new ArrayList<>(arr));
            int n=arr.size()-1;
            arr.remove(n);
            return;

        }
        
        Sum(root.left,arr,arr1);
        Sum(root.right,arr,arr1);
          arr.remove(arr.size()-1);

    }
    public int St(List<Integer> arr)
    {
        String s="";
        int n=arr.size();
        for(int i=0;i<n;i++)
        {
            s+=arr.get(i)+"";
    }
    return Integer.parseInt(s,2);

       
    }
}