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
    public List<Integer> postorderTraversal(TreeNode root)
     
     {
        Stack<TreeNode> st=new Stack<>();
        Stack<Integer> st1=new Stack<>();
        List<Integer> arr=new ArrayList<>();
        if(root==null)
        {
            return arr;
        }
        if(root!=null)
          st.push(root);

        while(!st.isEmpty())
        {
            TreeNode t=st.pop();
            if(t.left!=null)
            {
                st.push(t.left);
            }
             if(t.right!=null)
            {
                st.push(t.right);
            }
            st1.push(t.val);
        }
  while(!st1.isEmpty())
  {arr.add(st1.pop());
  }
        
      return arr;  
    }
}