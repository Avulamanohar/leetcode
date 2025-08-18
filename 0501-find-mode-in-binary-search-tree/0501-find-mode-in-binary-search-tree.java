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
    public int[] findMode(TreeNode root)
    { 
        Map<Integer,Integer> map=new HashMap<>();
        int a[]=new int[1];
        a[0]=0;
        find(root,a,map);
        Set<Integer> hs=map.keySet();
        List<Integer> arr=new ArrayList<>(hs);
        List<Integer> arr1=new ArrayList<>();
        int i,j;
        int n=arr.size();
         
        for(i=0;i<n;i++)
        {
            if(map.get(arr.get(i))==a[0])
            {
                arr1.add(arr.get(i));
            }
        }
        int m=arr1.size();
        int b[]=new int[m];
        for(i=0;i<m;i++)
        {
            b[i]=arr1.get(i);
        }
        return b;
    }
    public void find(TreeNode root,int a[],Map<Integer,Integer> map)
    {
        if(root==null)
        {
            return;
        }
        if(map.containsKey(root.val))
        {
            map.put(root.val,map.get(root.val)+1);
            a[0]=Math.max(a[0],map.get(root.val));
        }
        else
        {
            map.put(root.val,1);
             a[0]=Math.max(a[0],map.get(root.val));
        }
        find(root.left,a,map);
        find(root.right,a,map);
    }
}