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
    public List<Double> averageOfLevels(TreeNode root)
     {
        List<Double> arr=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)
        {
            return arr;
     }
     q.add(root);
     while(!q.isEmpty())
     {
        double sum=0;
        int n=q.size();
        for(int i=0;i<n;i++)
        {
            TreeNode h=q.poll();
            if(h.left!=null)
            {
                q.add(h.left);
            }
            if(h.right!=null)
            {
                q.add(h.right);
            }
            sum+=h.val;
        }
        double k=sum/(double)n;
        arr.add(k);
     }
      return  arr; 
    }
}