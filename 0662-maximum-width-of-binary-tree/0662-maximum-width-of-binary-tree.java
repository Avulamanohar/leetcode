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
 class tuple
 {
    TreeNode node;
    int row;
    public tuple(TreeNode node,int row)
    {
        this.node=node;
        this.row=row;
    }
 }
class Solution {
    public int widthOfBinaryTree(TreeNode root)
     {
        Queue<tuple> q=new LinkedList<>();
        int ans=0;
        if(root==null)
        {
            return 0;
        }
        q.add(new tuple(root,0));
        while(!q.isEmpty())
        {
            int min=q.peek().row;
            int first=0;
            int last=0;
            int n=q.size();
            int i,j;
            for(i=0;i<n;i++)
            {
                TreeNode t=q.peek().node;
                int curr=q.peek().row-min;
                q.poll();
                if(i==0)
                {
                    first=curr;
                }
                if(i==n-1)
                {
                    last=curr;
                }
                if(t.left!=null)
                {
                    q.add(new tuple(t.left,2*curr+1));
                }
                if(t.right!=null)
                {
                    q.add(new tuple(t.right,2*curr+2));
                }
                
            }
            ans=Math.max(ans,last-first+1);
        }
        
        return ans;
    }

}