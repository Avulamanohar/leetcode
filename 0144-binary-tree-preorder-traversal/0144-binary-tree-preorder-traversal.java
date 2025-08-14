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
    public List<Integer> preorderTraversal(TreeNode root)
    {
        List<Integer> arr=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        if(root==null)
        {
            return arr;
        }
        int i,j;
           st.push(root);
           while(!st.isEmpty())
           {
            int n=st.size();
            for(i=0;i<n;i++)
            {
                TreeNode t=st.pop();
                if(t.right!=null)
                {
                    st.add(t.right);
                }
                if(t.left!=null)
                {
                    st.add(t.left);
                }
                arr.add(t.val);
            }
           }
           return arr;
    }
    
}