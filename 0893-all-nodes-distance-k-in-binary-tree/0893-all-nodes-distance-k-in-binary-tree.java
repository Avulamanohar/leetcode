/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k)
    {
        Map<TreeNode,TreeNode> map=new HashMap<>();
        parent(root,map);
        Set<TreeNode> map1=new HashSet<>();
        map1.add(target);
        int f=0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(target);
        while(!q.isEmpty())
        {
            if(k==f)
            {
                break;
            }
           
            int n=q.size();
            for(int i=0;i<n;i++)
            {
                TreeNode p=q.poll();
                if(p.left!=null&&!map1.contains(p.left))
                {
               q.add(p.left);
               map1.add(p.left);
                }
                 if(p.right!=null&&!map1.contains(p.right))
                {
               q.add(p.right);
               map1.add(p.right);
                }
                if(map.get(p)!=null&&!map1.contains(map.get(p)))
                {
                    q.add(map.get(p));
                    map1.add(map.get(p));
                }
            }
             f++;

        }
        List<Integer> arr=new ArrayList<>();
        while(!q.isEmpty())
        {
            arr.add(q.poll().val);
        }
        return arr;
    }
    public void  parent(TreeNode root,Map<TreeNode,TreeNode> map)
    {
        if(root==null)
        {
            return;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode p=q.poll();
            if(p.left!=null)
            {  map.put(p.left,p);
                q.add(p.left);
              
            }
             if(p.right!=null)
            {    map.put(p.right,p);
                q.add(p.right);
            }
        }
    }
}