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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) 
    {
        LinkedList<TreeNode> arr1=new  LinkedList<TreeNode>();
        List<List<Integer>> arr2=new ArrayList<>();
        if(root==null)
        {
            return arr2;
        }
          int i,j,k;
        arr1.add(root);
         int  count =0;
        while(!arr1.isEmpty())
        {
            ArrayList<Integer> arr=new ArrayList<Integer>();
            int n=arr1.size();
            for(i=0;i<n;i++)
            {
                TreeNode q=arr1.remove(0);
                if(q.left!=null)
                {
                    arr1.add(q.left);
                }
                if(q.right!=null)
                {
                    arr1.add(q.right);
                }
                arr.add(q.val);
            }
            if(count%2==1)
            {
                Collections.reverse(arr);
               
            }
            count++;
            arr2.add(arr);
        }
        return arr2;
    }
}