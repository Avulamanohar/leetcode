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
        int i,j;
        st.push(root);
         TreeNode t=root.left;
        while(t!=null||!st.isEmpty())
        {
            int n=st.size();
            while(t!=null)
            {
             st.push(t);
             t=t.left;
            }   
            t=st.pop();
           
            arr.add(t.val);
           
            
            
             t=t.right;

        }
        return arr;
        
    }
}