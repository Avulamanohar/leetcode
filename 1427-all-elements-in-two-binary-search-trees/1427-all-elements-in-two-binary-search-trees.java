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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) 
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pr(root1,pq);
        pr(root2,pq);
        List<Integer> arr=new ArrayList<>();
        while(!pq.isEmpty())
        {
        arr.add(pq.poll());
        }

return arr;
        
    }
    public void pr(TreeNode root,PriorityQueue<Integer> pq)
    {
        if(root==null)
        {
            return;
        }
        pq.add(root.val);
        pr(root.left,pq);
        pr(root.right,pq);

    }
}