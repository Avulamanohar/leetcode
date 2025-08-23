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
    public int minDiffInBST(TreeNode root) 
    {
        Set<Integer> hs=new TreeSet<>();
        mini(root,hs);
        List<Integer> arr=new ArrayList<>(hs);
        int a=Integer.MAX_VALUE;
        for(int i=1;i<arr.size();i++)
        {
        a=Math.min(a,arr.get(i)-arr.get(i-1));
        }
        return a;
    }
    public void mini(TreeNode root,Set<Integer> hs)
    {
        if(root==null)
        {
            return;
        }
        hs.add(root.val);
        mini(root.left,hs);
        mini(root.right,hs);
    }
}