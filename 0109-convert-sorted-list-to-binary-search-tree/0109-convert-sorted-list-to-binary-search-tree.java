/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) 
    {
        if(head==null)
        {
            return null;
        }
        List<Integer> arr=new ArrayList<>();
        Link(head,arr);
        return BST(arr);
        
    }
    public void Link(ListNode root,List<Integer> arr)
    {
        if(root==null)
        {
            return;
        }
        arr.add(root.val);
        Link(root.next,arr);
    }
    public TreeNode BST(List<Integer> arr)
    {
        if(arr.size()==0)
        {
            return null;
        }
        int n=arr.size();
        int i,j;
        TreeNode root=new TreeNode(arr.get(n/2));
        List<Integer> arr1=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();
        for(i=0;i<n/2;i++)
        {
            arr1.add(arr.get(i));
        }
        for(i=n/2+1;i<n;i++)
        {
            arr2.add(arr.get(i));
        }
        root.left=BST(arr1);
        root.right=BST(arr2);
        return root;
    }
}