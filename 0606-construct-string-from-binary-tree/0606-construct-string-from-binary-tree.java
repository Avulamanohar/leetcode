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
    public String tree2str(TreeNode root)
    {
       StringBuilder sb=new StringBuilder();
        BT(root,sb);
        String s="";
     
        int n=sb.length();
        return sb.toString().substring(1,n-1);
        
    }
    public void BT(TreeNode root,StringBuilder sb)
    {
        if(root.left==null&&root.right==null)
        {    sb.append('(');
            
             sb.append(root.val);
             sb.append(')');
            return;
        }
       
        else 
        {
         sb.append('(');
          sb.append(root.val);
            if(root.left==null)
            {
                sb.append('(');
                sb.append(')');
            }
            else
            {
                BT(root.left,sb);
            }
           
            if(root.right!=null)
            {
                BT(root.right,sb);
            }
            sb.append(')');
            
        }
    }
}