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
 class tuple
 {
    TreeNode node;
    int row;
    int col;
    public tuple(TreeNode node,int row,int col)
    {
        this.node=node;
        this.row=row;
        this.col=col;
    }
 }
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root)
    {
        
        List<List<Integer>> arr=new ArrayList<>();
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> pr=new TreeMap<>();
      
        if(root==null)
        {
            return arr;
        }
        Queue<tuple> q=new LinkedList<>();
        q.add(new tuple(root,0,0));
        while(!q.isEmpty())
        {
            tuple t=q.poll();
            TreeNode nod=t.node;
            int r=t.row;
            int c=t.col;
            if(!pr.containsKey(r))
            {
                pr.put(r,new TreeMap<>());
            }
            if(!pr.get(r).containsKey(c))
            {
                pr.get(r).put(c,new PriorityQueue<>());
            }
            pr.get(r).get(c).add(nod.val);
            if(nod.left!=null)
            {
                q.add(new tuple(nod.left,r-1,c+1));
            }
             if(nod.right!=null)
            {
                q.add(new tuple(nod.right,r+1,c+1));
            }
        }

        for(TreeMap<Integer,PriorityQueue<Integer>> p:pr.values())
        {
            List<Integer> ar=new ArrayList<>();
            for(PriorityQueue<Integer> pq:p.values())
            {
                while(!pq.isEmpty())
                {
                    ar.add(pq.poll());
                }
            }
            arr.add(ar);
           

        }

 return arr;
    }
    }
 
