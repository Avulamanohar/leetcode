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
class FindElements {
   TreeNode root;
    public FindElements(TreeNode root)
    { root.val=0;
        findy(root);
        this.root=root;
    }
    public void findy(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        if(root.left!=null)
        {
            root.left.val=2*root.val+1;
        }
        if(root.right!=null)
        {
            root.right.val=2*root.val+2;
        }
        findy(root.left);
        findy(root.right);
    }
    
    public boolean find(int target) 
    {
        boolean b[]=new boolean[1];
        fin(root,target,b);
        return b[0];
        
    }
    public void fin(TreeNode root,int value,boolean b[])
    {
        if(root==null)
        {
            return;
        }
        if(value==root.val)
        {
            b[0]=true;
        }
        fin(root.left,value,b);
        fin(root.right,value,b);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */