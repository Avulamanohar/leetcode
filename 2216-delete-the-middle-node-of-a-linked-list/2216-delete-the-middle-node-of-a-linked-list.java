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
    public ListNode deleteMiddle(ListNode head) 
    {   if(head.next==null)
    {
        return null;
    }
        int count=1;
        ListNode slow=head;
        ListNode fast=head;
        ListNode hi=head;
        while(fast!=null&&fast.next!=null)
        {     count=count+1;
            hi=slow;
            fast=fast.next.next;
            slow=slow.next;
          
        }
    hi.next=hi.next.next;
        return head;
        
    }
}