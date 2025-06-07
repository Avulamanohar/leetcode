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
    public List<List<Integer>> levelOrder(TreeNode root)
    {
        int i,j;
        List<List<Integer>> arr=new ArrayList<>();
        List<TreeNode> q=new LinkedList<TreeNode>();
        if(root!=null)
        {
        q.add(root);
        }
        while(!q.isEmpty())
        {
            int n=q.size();
            List<Integer> arr1=new ArrayList<>();
            for(i=0;i<n;i++)
            {   TreeNode m=q.remove(0);
                arr1.add(m.val);
                if(m.left !=null)
                {
                    q.add(m.left);
                }
                  if(m.right!=null)
                {
                    q.add(m.right);
                }
               
            }
            arr.add(arr1);
        }
        return arr;
    }
   
    
}