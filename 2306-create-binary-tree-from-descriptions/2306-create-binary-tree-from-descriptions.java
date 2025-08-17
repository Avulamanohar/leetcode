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
    public TreeNode createBinaryTree(int[][] descriptions)
    {
        int n=descriptions.length;
        Set<Integer> hs=new HashSet<>();
        List<Integer> arr=new ArrayList<>();
        int i,j;
        int f=0;
        for(i=0;i<n;i++)
        {
            hs.add(descriptions[i][1]);
            arr.add(descriptions[i][0]);
        }
        for(i=0;i<n;i++)
        {
            if(!hs.contains(arr.get(i)))
            {
                f=arr.get(i);
            }
        }
Map<Integer,TreeNode> map=new HashMap<>();
for(int a[]:descriptions)
{
    int parent=a[0],child=a[1],lr=a[2];
    TreeNode p,c;
    if(map.containsKey(parent))
    {   p=map.get(parent);
    }
    else
    {
        p=new TreeNode(parent);
        map.put(parent,p);
    }
        if(map.containsKey(child))
        {
            c=map.get(child);
        
        }
        else
        {
            c=new TreeNode(child);
            map.put(child,c);
        }
    if(lr==1)
    {
        p.left=c;
    }
    else
    {
        p.right=c;
    }
}
        

     
     return   map.get(f); 

    }
   
}