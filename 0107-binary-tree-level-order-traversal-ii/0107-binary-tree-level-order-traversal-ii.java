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
    public List<List<Integer>> levelOrderBottom(TreeNode root) 
    {
        int i,j;
        List<List<Integer>> arr=new ArrayList<>();
        Queue<TreeNode> st=new LinkedList<>();
        if(root==null)
        {
            return arr;

        }
        st.add(root);
        while(!st.isEmpty())
        {
            List<Integer> arr1=new ArrayList<>();
            int n=st.size();
       
            for(i=0;i<n;i++)
            {
                      TreeNode k=st.poll();
                      if(k.left!=null)
                      {
                        st.add(k.left);
                      }
                      if(k.right!=null)
                      {
                        st.add(k.right);
                      }
                      arr1.add(k.val);
            }
            arr.add(arr1);

        }
        Collections.reverse(arr);
return arr;

        
    }
}