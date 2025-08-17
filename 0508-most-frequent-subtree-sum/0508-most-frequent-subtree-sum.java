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
    public int[] findFrequentTreeSum(TreeNode root) 
    {
        if(root==null)
        {
            return new int[0];
        }
        int a[]=new int[1];
        a[0]=1;
        Map<Integer,Integer> map=new HashMap<>();
       int h= BT(root,map,a);
        Set<Integer> hs=map.keySet();
        List<Integer> arr=new ArrayList<>(hs);
        List<Integer> arr1=new ArrayList<>();
        for(int i=0;i<arr.size();i++)
        {
            if(map.get(arr.get(i))==a[0])
            {
                arr1.add(arr.get(i));
            }
        }
        int b[]=new int[arr1.size()];
        for(int i=0;i<arr1.size();i++)
        {
            b[i]=arr1.get(i);
        }
         return b;
    }
    public int BT(TreeNode root,Map<Integer,Integer> map,int a[])
    {
        if(root==null)
        {
              return 0;
         }
         int l=BT(root.left,map,a);
         int b=BT(root.right,map,a);
      int   sum=root.val+l+b;
         if(map.containsKey(sum))
         {
            map.put(sum,map.get(sum)+1);
            a[0]=Math.max(map.get(sum),a[0]);
         }
         else
         {
            map.put(sum,1);
              a[0]=Math.max(map.get(sum),a[0]);
         }
         return sum;
    }
}