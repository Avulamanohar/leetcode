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
    public int findSecondMinimumValue(TreeNode root)
    {Set<Integer> hs=new HashSet<>();
    hi(root,hs);
    ArrayList<Integer> arr=new ArrayList<>(hs);
    Collections.sort(arr);
    if(arr.size()<2)
    {
        return -1;
    }
    return arr.get(1);
        
    }
    public void hi(TreeNode root,Set<Integer> hs)
    {
        if(root==null)
        {
            return;
        }
        hs.add(root.val);
        if(root.left!=null)
        {
            hi(root.left,hs);
        }
         if(root.right!=null)
        {
            hi(root.right,hs);
        }
    }
}