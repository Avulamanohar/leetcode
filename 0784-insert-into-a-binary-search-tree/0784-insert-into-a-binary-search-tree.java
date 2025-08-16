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
    public TreeNode insertIntoBST(TreeNode root, int val)
    {
        if(root==null)
        {
          TreeNode t=new TreeNode(val);
          return t;
        }
        insert(root,val);
        return root;
    }
    public void insert(TreeNode root,int val)
    {
        if(root.val>val)
        {
            if(root.left==null)
            {
                root.left=new TreeNode(val);
                return;
            }
            else
            {
            insert(root.left,val);
            }
        }
        if(root.val<val)
        {
            if(root.right==null)
            {
                root.right=new TreeNode(val);
                return;
            }else
            {
            insert(root.right,val);
            }
        }
    }
    
}