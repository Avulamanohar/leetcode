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
    public int amountOfTime(TreeNode root, int start) 
    {
        Map<TreeNode,TreeNode> map=new HashMap<>();
        parent(root,map);
        TreeNode t[]=new TreeNode[1];
        find(root,start,t);
        Queue<TreeNode> q=new LinkedList<>();
        Set<TreeNode> hs=new HashSet<>();
        q.add(t[0]);
        hs.add(t[0]);
        int count=0;
        while(!q.isEmpty())
        {
            int n=q.size();
            for(int i=0;i<n;i++)
            {   TreeNode p=q.poll();
                if(p.left!=null&&!hs.contains(p.left))
                {
                    q.add(p.left);
                    hs.add(p.left);
                }
                if(p.right!=null&&!hs.contains(p.right))
                {
                    q.add(p.right);
                    hs.add(p.right);
                }
                if(map.get(p)!=null&&!hs.contains(map.get(p)))
                {
                    q.add(map.get(p));
                    hs.add(map.get(p));
                }
            }
            count++;
        }
        return count-1;
        
    }
    public void parent(TreeNode root,Map<TreeNode,TreeNode> map)
    {
      
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode p=q.poll();
            if(p.left!=null)
            {
                map.put(p.left,p);
                q.add(p.left);
            }
             if(p.right!=null)
            {
                map.put(p.right,p);
                q.add(p.right);
            }
        }
    }
    public void find(TreeNode root,int a,TreeNode b[])
    {
        if(root==null)
        {
            return;
        }
        if(root.val==a)
        {
      b[0]=root;
        }
        find(root.left,a,b);
        find(root.right,a,b);
    }

}