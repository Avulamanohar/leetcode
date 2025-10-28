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
    public ListNode swapPairs(ListNode head) 
    {
        if(head==null||head.next==null)
        {
            return head;
        }
        ListNode temp=head;
        while(head!=null&&head.next!=null)
        {
            int tem=head.val;
            head.val=head.next.val;
            head.next.val=tem;
            if(head.next!=null)
            {
            head=head.next.next;
            }
            else
           {
            head=head.next;
           }

        }
        return temp;
        
    }
}