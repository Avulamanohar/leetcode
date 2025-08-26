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
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        int count=0;
        ListNode hi=head;
        ListNode his=head;

        while(hi!=null)
        {
            count++;
            hi=hi.next;
        }
        int m=count-n;
        int i=0;
        while(m==0)
        {
           return head.next;
        }
        while(m!=1)
        {
   his=his.next;
   m--;
        }
        
        his.next=his.next.next;
        
        return head;
        
    }
}