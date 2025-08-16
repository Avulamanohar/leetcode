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
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries)
    {
        List<Integer> arr=new ArrayList<>();
        closest(root,arr);
        Collections.sort(arr);
        List<List<Integer>> arr1=new ArrayList<>();
        int n=queries.size();
       for(int i=0;i<n;i++)
        {
            List<Integer> arr2=new ArrayList<>();
            arr2.add(floor(arr,queries.get(i)));

            arr2.add(ceil(arr,queries.get(i)));
            arr1.add(arr2);
        }
        return arr1;
      

        
    }
    public void closest(TreeNode root,List<Integer> arr)
    {
        if(root==null)
        {
            return ;
        }
        arr.add(root.val);
        closest(root.left,arr);
        closest(root.right,arr);
    }
    public int  ceil(List<Integer> arr,int a)
    {
       int i,j;
       int n=arr.size();
       j=n-1;
       i=0;
       while(i<=j)
       {
        int mid=i+(j-i)/2;
        if(arr.get(mid)<a)
        {
           i=mid+1;
        }
        else
        {
            j=mid-1; 
        }
       
       }
        if(i==n)
        {
         return -1;
        }
        return arr.get(i);
    }
      public int  floor(List<Integer> arr,int a)
    {
       int i,j;
       int n=arr.size();
       j=n-1;
       i=0;
       while(i<=j)
       {
        int mid=i+(j-i)/2;
        if(arr.get(mid)<=a)
        {
           i=mid+1;
        }
        else
        {
            j=mid-1;
        }
       
       }
       if(j==-1)
       {
        return -1;
       }
      
        return arr.get(j);
    }
}