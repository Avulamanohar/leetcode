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
    public ListNode mergeKLists(ListNode[] lists)
    {
        if(lists.length==0)
        {
            return null;
        }
         
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<lists.length;i++)
        {
            ListNode k=lists[i];
            while(k!=null)
            {
                pq.add(k.val);
                k=k.next;
            }
        }
        if(pq.size()==0)
        {
            return null;
        }
        ListNode head=new ListNode(pq.poll());
        ListNode b=head;
        while(!pq.isEmpty())
        {
            b.next=new ListNode(pq.poll());
            b=b.next;

        }
        return head;

    }
}