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
    public String smallestFromLeaf(TreeNode root) 
    {
      List<List<Integer>> map=new ArrayList<>();
      List<Integer> arr=new ArrayList<>();  
      int sum[]=new int[1];
      small(root,map,arr);
      List<String> arr2=new ArrayList<>();
      Collections.sort(arr);
      for(List<Integer> arr1:map)
      {
      Collections.reverse(arr1);
      String s="";

      for(int i=0;i<arr1.size();i++)
      {
        s+=(char)(arr1.get(i)+97)+"";

       }
       arr2.add(s);
    
    }
    return Collections.min(arr2);

    }
    public void small(TreeNode root,List<List<Integer>> map,List<Integer> arr)
    {
        if(root==null)
        {
            return;
        }
        arr.add(root.val);

        if(root.left==null&&root.right==null)
        {
                
        
            map.add(new ArrayList<>(arr));
            arr.remove(arr.size()-1);
            
            return;
        }
        small(root.left,map,arr);
        small(root.right,map,arr);
        arr.remove(arr.size()-1);
        
    }
}