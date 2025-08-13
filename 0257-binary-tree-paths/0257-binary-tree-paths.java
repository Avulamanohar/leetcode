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
    public List<String> binaryTreePaths(TreeNode root) 
    {  
        List<String> s1=new ArrayList<>();
        List<List<Integer>> arr=new ArrayList<>();
        List<Integer> arr1=new ArrayList<>();
        leaf(root,arr,arr1);
        int i;
        for(List<Integer> f:arr)
        {
            int n=f.size();
            String s="";
            for(i=0;i<n;i++)
            {
                s+=Integer.toString(f.get(i))+"->";
            }

            s1.add(s.substring(0,s.length()-2));
        }
        return s1;

        
    }
    public void leaf(TreeNode root, List<List<Integer>> arr,List<Integer> arr1)
    {
        if(root==null)
        {
            return;
        }
        arr1.add(root.val);
        if(root.left==null&&root.right==null)
        {
            arr.add(new ArrayList<>(arr1));
              arr1.remove(arr1.size()-1);
              return;
        }

        if(root.left!=null)
        {
            leaf(root.left,arr,arr1);
        }
        if(root.right!=null)
        {
            leaf(root.right,arr,arr1);
        }
        arr1.remove(arr1.size()-1);
    }
}