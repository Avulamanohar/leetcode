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
    public List<Integer> inorderTraversal(TreeNode root) 
    {
        Stack<TreeNode> st=new Stack<>();
        List<Integer> arr=new ArrayList<>();
        if(root==null)
        {
            return arr;
        }
        TreeNode t=root;
        while(true)
        {
            if(t!=null)
            {
                st.push(t);
                t=t.left;
            }
            else
            {
                if(st.isEmpty())
                {
                    break;
                }
                TreeNode nod=st.pop();
                arr.add(nod.val);
                t=nod.right;
            }
        }
        return arr;
    }
}