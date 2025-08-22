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
    public TreeNode balanceBST(TreeNode root)
     {
     
        List<TreeNode> arr=new ArrayList<>();
        bal(root,arr);
        return BST(arr);
    }
    public void bal(TreeNode root,List<TreeNode> map)
    {
        if(root==null)
        {
            return;
        }
        bal(root.left,map);
        map.add(root);;
        bal(root.right,map);
    }
    public TreeNode  BST(List<TreeNode> arr)
    {
        if(arr.size()==0)
        {
            return null;
        }
        List<TreeNode> arr1=new ArrayList<>();
        List<TreeNode> arr2=new ArrayList<>();
        int n=arr.size();
        TreeNode root=arr.get(n/2);
        for(int i=0;i<n/2;i++)
        {
              arr1.add(arr.get(i));
        }
           for(int i=n/2+1;i<n;i++)
        {
              arr2.add(arr.get(i));
        }
        root.left=BST(arr1);
        root.right=BST(arr2);
        return root;

    }
}