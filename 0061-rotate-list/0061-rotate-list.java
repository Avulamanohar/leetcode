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
class Solution {
    public ListNode rotateRight(ListNode head, int k) 
    {
        if(head==null||head.next==null)
        {
            return head;
        }
        ListNode temp=head;
        ListNode temp1=head;
        List<Integer> arr=new ArrayList<>();
        while(temp!=null)
        {
            arr.add(temp.val);
            temp=temp.next;

        }
        int n=arr.size();
       List<Integer> arr2=new ArrayList<>();

        int f=k%n;
        
        for(int i=n-f;i<n;i++)
        {
arr2.add(arr.get(i));
        }
        for(int i=0;i<n-f;i++)
        {
            arr2.add(arr.get(i));
        }
        int i=0;
        while(temp1!=null)
        {
            temp1.val=arr2.get(i++);
            temp1=temp1.next;
        }
        return head;
}}