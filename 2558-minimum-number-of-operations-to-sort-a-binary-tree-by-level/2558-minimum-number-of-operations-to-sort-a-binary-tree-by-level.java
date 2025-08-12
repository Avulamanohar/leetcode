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
    public int minimumOperations(TreeNode root)
    {
        List<List<Integer>> arr=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)
        {
            return 0;
        }
        q.add(root);
        while(!q.isEmpty())
        {
            List<Integer> arr1=new ArrayList<>();
            int n=q.size();
            for(int i=0;i<n;i++)
            {
                TreeNode k=q.poll();
                if(k.left!=null)
                {
                    q.add(k.left);

                }
                if(k.right!=null)
                {
                    q.add(k.right);
                }
                arr1.add(k.val);
            }
            arr.add(arr1);
        }

        int count=0;
      
        int n=arr.size();
        int i,j;
        for(i=0;i<n;i++)
        {      List<Pair<Integer,Integer>> prr=new ArrayList<>();
             ArrayList<Integer> arr2=new ArrayList<>(arr.get(i));
        int m=arr2.size();
            for(j=0;j<m;j++)
            {
               prr.add(new Pair<>(arr2.get(j),j));
            }
            prr.sort((p1,p2)->p1.getKey().compareTo(p2.getKey()));
            for(j=0;j<m;j++)
            {
                
            
                    
                    while(prr.get(j).getValue()!=j)
                    {
                    count++;
                    Collections.swap(prr,j,prr.get(j).getValue());
                    
                }
            }
        }   

        return count;
    }
}