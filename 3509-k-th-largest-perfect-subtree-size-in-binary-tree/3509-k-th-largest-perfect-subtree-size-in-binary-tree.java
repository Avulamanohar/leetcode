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
    public int kthLargestPerfectSubtree(TreeNode root, int k) 
    {  
    
       
      
           ArrayList<Integer> arr=new ArrayList<>();
        int n= hi(root,arr);
       
        Collections.sort(arr);
        Collections.reverse(arr);
        if(k<=arr.size())
        {
        return (1<<arr.get(k-1))-1;
        } 
        return -1;

    }
    public int hi(TreeNode root,List<Integer> hs)
    {
        if(root==null)
        {
            return 0;

        }
        int a=hi(root.left,hs);
        int b=hi(root.right,hs);
        if(a==-1)
        {
            return -1;
        }
        if(b==-1)
        {
            return -1;
        }
        if(a!=b)
        {
             return -1;
          
        }
         hs.add(a+1);
        return a+1;
    }
}