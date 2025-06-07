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
 import java.util.*;
class Solution {
    public List<Integer> preorderTraversal(TreeNode root)
     {
        return preorderTraversal1(root,new ArrayList<Integer>());
    }
    public List<Integer> preorderTraversal1(TreeNode root,List<Integer> arr)
    {
        
        if(root!=null)
        {
        arr.add(root.val);
        
        
        if(root.left!=null)
        {
        preorderTraversal1(root.left,arr);
        }
        if(root.right!=null)
        {
        preorderTraversal1(root.right,arr);
        }
    }
    return arr;             
    }

}