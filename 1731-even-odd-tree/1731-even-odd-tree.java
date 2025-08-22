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
    public boolean isEvenOddTree(TreeNode root) 
    {
        Queue<TreeNode> q=new LinkedList<>();

        q.add(root);
      int ind=0;
        while(!q.isEmpty())
        {
            int n=q.size();
            List<Integer> arr=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                TreeNode r=q.poll();
                if(r.left!=null)
                {q.add(r.left);
                }
                if(r.right!=null)
                {
                    q.add(r.right);
                }
                arr.add(r.val);
            }
            boolean b=true;
            if(ind%2==1)
            {
               b= even(arr);
            }
            else
            {
                b=odd(arr);
            }
            if(!b)
            {
                return false;
            }
            ind++;
        }
        return true;
        }
        public boolean even(List<Integer> arr)
        {
            if(arr.size()==0)
            {
                return true;
            }
            int n=arr.size();
            int a=arr.get(0);
            if(a%2!=0)
            {
                return false;
            }
            for(int i=1;i<n;i++)
            {
                if(arr.get(i)%2!=0 || arr.get(i)>=arr.get(i-1))
                {
                    return false;
                }
            }
            return true;
        }
        public boolean odd(List<Integer> arr)
        {
            if(arr.size()==0)
            {
                return true;
            }
            int n=arr.size();
            int a=arr.get(0);
            if(a%2==0)
            {
                return false;
            }
            for(int i=1;i<n;i++)
            {
                if(arr.get(i)%2==0 || arr.get(i)<=arr.get(i-1))
                {
                    return false;
                }
            }
            return true;
        }
        
    
}