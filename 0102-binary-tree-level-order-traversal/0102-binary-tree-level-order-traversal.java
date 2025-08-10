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
     List<List<Integer>> arr=new ArrayList<>();
     if(root==null)
     {
        return arr;
     }
     Queue<TreeNode> k=new LinkedList<>();
     k.add(root);
     while(!k.isEmpty())
     {
        List<Integer> ar=new ArrayList<>();
        int n=k.size();
        int i,j;
        for(i=0;i<n;i++)
        {
            TreeNode Nod=k.poll();
            if(Nod.left!=null)
            {
                k.add(Nod.left);
            }
              if(Nod.right!=null)
            {
            k.add(Nod.right);
            }
            ar.add(Nod.val);
        }
        arr.add(ar);
     }

return arr;

    }
}