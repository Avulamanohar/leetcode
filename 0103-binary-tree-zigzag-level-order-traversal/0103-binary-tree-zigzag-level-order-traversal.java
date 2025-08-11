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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root)
    {
        List<List<Integer>> arr=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)
        {
            return arr;
        }
        q.add(root);
        int k=0;
        while(!q.isEmpty())
        {
            List<Integer> ar=new ArrayList<>();
            int n=q.size();
            int i,j;
          
            for(i=0;i<n;i++)
            {  TreeNode h=q.poll();
                if(h.left!=null)
                {
                    q.add(h.left);

                }
                if(h.right!=null)
                {
                    q.add(h.right);
                }
                ar.add(h.val);
            }
            
            if(k%2!=0)
            {
                Collections.reverse(ar);
            }
            arr.add(ar);
            k++;

        }
        return arr;
    }
}