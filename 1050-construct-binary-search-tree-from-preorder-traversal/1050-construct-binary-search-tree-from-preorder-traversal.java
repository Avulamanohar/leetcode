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
    public TreeNode bstFromPreorder(int[] preorder) 
    {

        List<Integer> arr=new ArrayList<>();
        for(int i:preorder)
        {
           arr.add(i);
        }
        return BST(arr);
    }
    public TreeNode BST(List<Integer> arr)
    {
          if(arr.size()==0)
          {
            return null;
          }
          List<Integer> arr1=new ArrayList<>();
          List<Integer> arr2=new ArrayList<>();
          int a=arr.get(0);
          TreeNode root=new TreeNode(a);
          for(int i=1;i<arr.size();i++)
          {
            if(arr.get(i)<a)
            {
                arr1.add(arr.get(i));
            }
             if(arr.get(i)>a)
            {
                arr2.add(arr.get(i));
            }
          }
          root.left=BST(arr1);
          root.right=BST(arr2);
          return root;
    }
}