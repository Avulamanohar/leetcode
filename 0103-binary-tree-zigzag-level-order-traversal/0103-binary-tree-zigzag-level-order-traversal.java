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
       int c=0;
       List<List<Integer>> arr=new ArrayList<>();
       if(root==null)
       {
        return arr;
       }
       Queue<TreeNode> q=new LinkedList<>();
       q.add(root);
       while(!q.isEmpty())
       {
        List<Integer> a1=new ArrayList<>();
        int n=q.size();
        for(int i=0;i<n;i++)
        {

        
        TreeNode r=q.poll();
        if(r.left!=null)
        {
            q.add(r.left);
        }
        if(r.right!=null)
        {
            q.add(r.right);
        }
        a1.add(r.val);
        }

        if(c%2!=0)
        {
            Collections.reverse(a1);
        }
        c++;
        arr.add(new ArrayList<>(a1));
       }
return arr;
    }
}