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
    public TreeNode buildTree(int[] preorder, int[] inorder)
     { 
       
        List<Integer> pr=new ArrayList<>();
        List<Integer> in=new ArrayList<>();
        for(int i:preorder)
        {
            pr.add(i);
        }
        for(int i:inorder)
        {
            in.add(i);
        }
        return build(pr,in);

    }
    public TreeNode build(List<Integer> pr,List<Integer> in)
    {
        if(pr.size()==0&&in.size()==0)
        {
            return null;
        }
        int a=pr.get(0);
        TreeNode root=new TreeNode(a);
        int j=-1;
        for(int i=0;i<in.size();i++)
        {
            if(in.get(i)==a)
            {
                j=i;
            }
        }
       List<Integer> pr1=new ArrayList<>();
       List<Integer> in1=new ArrayList<>();
       List<Integer> pr2=new ArrayList<>();
       List<Integer> in2=new ArrayList<>();
       int i;
       for(i=1;i<=j;i++)
       {
        pr1.add(pr.get(i));
       }
        for(i=0;i<j;i++)
       {
        in1.add(in.get(i));
       }
        for(i=j+1;i<pr.size();i++)
       {
         pr2.add(pr.get(i));
       }
        for(i=j+1;i<in.size();i++)
       {
        in2.add(in.get(i));
       }
       root.left=build(pr1,in1);
       root.right=build(pr2,in2);
       return root;

       


    }
}