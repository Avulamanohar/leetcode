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
    public List<Integer> largestValues(TreeNode root)
    {
        Queue<TreeNode> q=new LinkedList<>();
        List<Integer> arr=new ArrayList<>();
        if(root==null)
        {
            return arr;
        }
        q.add(root);
        int i,j;
        while(!q.isEmpty())
        {   List<Integer> arr1=new ArrayList<>();
           
            int n=q.size();
            for(i=0;i<n;i++)
            {   
                 TreeNode t=q.poll();
                if(t.left!=null)
                {
                    q.add(t.left);
                }
                if(t.right!=null)
                {
                    q.add(t.right);
                }
                arr1.add(t.val);
            }
            Collections.sort(arr1);
            
            arr.add(arr1.get(arr1.size()-1));

        }
        return arr;
    }
}