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
    public int maxLevelSum(TreeNode root)
    {
        List<Integer> arr=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)
        {
            return 1;
        }
        int i,j;
        q.add(root);
        int max=Integer.MIN_VALUE;
        int k=-1;
        int b=0;
        while(!q.isEmpty())
        {   b++; 
           
            int sum=0;
            int n=q.size();
            for(i=0;i<n;i++)
            { TreeNode t=q.poll();
                if(t.left!=null)
                {
                    q.add(t.left);
                }
                if(t.right!=null)
                {
                    q.add(t.right);
                }
                sum+=t.val;
            }
            if(max<sum)
            {
            k=b;
            max=sum;
            }
            
        }
        return k;
    }
}