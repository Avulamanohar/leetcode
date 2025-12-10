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
    public ListNode partition(ListNode head, int x) 
    {
        if(head==null)
        {
            return null;
        }
        List<ListNode> arr=new ArrayList<>();
        ListNode head1=head;
        while(head1!=null)
        {
              if(head1.val<x)
              {
                arr.add(head1);
              }
              head1=head1.next;
        }
          while(head!=null)
        {
              if(head.val>=x)
              {
                arr.add(head);
              }
              head=head.next;
        }
        head=arr.get(0);
        head1=head;
        for(int i=1;i<arr.size();i++)
        {
            head.next=arr.get(i);
            head=arr.get(i);
        }
        head.next=null;

        
        return head1;
    }
}