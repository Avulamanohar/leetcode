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
    public ListNode sortList(ListNode head) 
    {
        PriorityQueue<Integer> p=new PriorityQueue<>();
        ListNode temp=head;
        ListNode temp1=head;
        while(temp!=null)
        {
            p.add(temp.val);
            temp=temp.next;
        }
                while(temp1!=null)
        {
            temp1.val=p.poll();
            temp1=temp1.next;
        }
        return head;
    }
}