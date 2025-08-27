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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2)
    {
        PriorityQueue<Integer> p=new PriorityQueue<>();
        while(list1!=null)
        {
            p.add(list1.val);
            list1=list1.next;
        }
        while(list2!=null)
        {
            p.add(list2.val);
            list2=list2.next;
        }
        if(p.isEmpty())
        {
            return null;
        }
        ListNode head=new ListNode(p.poll());
        ListNode temp=head;
        while(!p.isEmpty())
        {
            head.next=new ListNode(p.poll());
            head=head.next;
        } 
        return temp;
    }
}